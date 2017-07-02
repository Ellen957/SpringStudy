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

	//����rs.hasnext��ԭ������ʵ�ֵ��ô˽ӿڵ�ʱ���Ѿ���ȡѭ��
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
