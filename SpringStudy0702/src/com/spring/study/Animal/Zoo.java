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
 *@function  ����Autowired����ע�⣬���Զ����Ա�������б�ע��������set��get������ʹ��
 */
@Repository
public class Zoo {
	@Autowired
	Animal dog ;
	
	
	public void test(){
		dog.speak();
	}
}
