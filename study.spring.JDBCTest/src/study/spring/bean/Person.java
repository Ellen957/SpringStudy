/**
 * 
 */
package study.spring.bean;

/**
 * @author Administrator
 *
 */
public class Person {
	private Integer ID;
	private String Name;
	
	public Person(){}
	
	public Person(Integer ID,String Name){
		this.ID = ID;
		this.Name = Name;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
