import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.spring.bean.Person;
import study.spring.service.PersonService;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		PersonService person = (PersonService)ctx.getBean("personService");
//		person.save(new Person(123321,"dd"));
//		Person p = person.getPerson(123456);
//		System.out.println(p.getName());
		Person p = new Person();
		p = person.getPerson(2);
		
	}
}
