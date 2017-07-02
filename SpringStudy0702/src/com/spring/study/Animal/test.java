/**
 * 
 */
package com.spring.study.Animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class test {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
		Zoo zo = (Zoo)a.getBean("zoo");
		zo.test();	
	}
	
	
}
