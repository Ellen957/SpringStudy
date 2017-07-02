/**
 * 
 */
package study.spring.service;

import java.util.List;

import study.spring.bean.Person;

/**
 * @author Administrator
 *
 */
public interface PersonService {
	public void save(Person person);
	
	public void update(Person person);
	
	public Person getPerson(Integer ID);
	
	public void delete(Integer ID);
	
	public List<Person> getPersons();
}
