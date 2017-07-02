/**
 * 
 */
package study.spring.Imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import study.spring.bean.Person;

/**
 * @author Administrator
 *
 */
public class PersonRowMapper implements RowMapper {

	//不用rs.hasnext的原因是在实现调用此接口的时候已经采取循环
	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public Object mapRow(ResultSet rs, int index) throws SQLException {
		String name = rs.getString("Name");
		Integer id = rs.getInt("ID");
		Person person  = new Person(id,name);
		return person;
		
	}

}
