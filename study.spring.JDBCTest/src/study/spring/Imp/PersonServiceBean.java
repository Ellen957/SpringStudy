/**
 * 
 */
package study.spring.Imp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import study.spring.bean.Person;
import study.spring.service.PersonService;

/**
 * @author Administrator
 *
 */
public class PersonServiceBean implements PersonService{
//	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		//		this.dataSource = dataSource;
	}

	/* (non-Javadoc)
	 * @see study.spring.service.PersonService#save(study.spring.bean.Person)
	 */
	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into person(ID,Name) values(?,?)",new Object[]{person.getID(),person.getName()},new int[]{java.sql.Types.INTEGER,java.sql.Types.VARCHAR});
		System.out.println("Save successfully!");
	}

	/* (non-Javadoc)
	 * @see study.spring.service.PersonService#update(study.spring.bean.Person)
	 */
	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update person set Name=? where ID=?",new Object[]{person.getName(),person.getID()},new int[]{java.sql.Types.VARCHAR,java.sql.Types.INTEGER});
	}

	/* (non-Javadoc)
	 * @see study.spring.service.PersonService#getPerson()
	 */
	@Override
	public Person getPerson(Integer ID) {
		// TODO Auto-generated method stub
		return (Person)jdbcTemplate.queryForObject("select * from person where ID = ?",new Object[]{ID},new int[]{java.sql.Types.INTEGER},new PersonRowMapper());
	}

	/* (non-Javadoc)
	 * @see study.spring.service.PersonService#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer ID) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete person where ID=?",new Object[]{ID},new int[]{java.sql.Types.INTEGER});
	}

	/* (non-Javadoc)
	 * @see study.spring.service.PersonService#getPersons()
	 */
	@Override
	public List<Person> getPersons() {
		//personrowmanager »Øµ÷º¯Êý
		return (List<Person>)jdbcTemplate.query("select * from person ",new PersonRowMapper());
	}
}
