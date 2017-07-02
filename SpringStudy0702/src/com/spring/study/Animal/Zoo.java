/**
 * 
 */
package com.spring.study.Animal;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 *@function  采用Autowired方法注解，可以对类成员变量进行标注，减少了set、get方法的使用
 */
@Repository
public class Zoo {
	@Autowired
	Animal dog ;
	
	
	public void test(){
		dog.speak();
	}
}
