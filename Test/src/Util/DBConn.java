/**
 * 
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrator
 *
 */
public class DBConn {
	public static String Driver;
	public static String URL;
	public static String User;
	public static String Pwd;
	public static Connection conn;
	public static Statement stmt;
	public ResultSet rs;
	
	static{
		try{
			Driver="com.mysql.jdbc.Driver";
			URL="jdbc:mysql://127.0.0.1:3306/emp?useUnicode=true&characterEncoding=UTF-8";
			User="root";
			Pwd="123456";
			Class.forName(Driver);
			conn = DriverManager.getConnection(URL,User,Pwd);
			System.out.println("----���ӳɹ�----");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//���캯����Ĭ�ϼ��������ļ�Driver
	public DBConn(){
		this.conn = this.getConn();
	}
	
	public Connection getConn(){
		return this.conn;
	}
	//��ѯ���
	public ResultSet doSelect(String sql){
		try{
			conn = DriverManager.getConnection(URL,User,Pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("ȡ�ý����");
		return rs;
	}
	//�������
	public ResultSet doAdd(String sql){
		try{
			conn = DriverManager.getConnection(URL,User,Pwd);
			stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("DBConn��ִ��"+i+"�����");
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
	//ɾ��
	public boolean doDelete(String sql){
		boolean Result = false;
		try{
			conn = DriverManager.getConnection(URL,User,Pwd);
			stmt = conn.createStatement();
			Result = stmt.execute(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return Result;
	}
	
	public boolean doUpdate(String sql){
		boolean Result = false;
		int i=0;
		try{
			conn = DriverManager.getConnection(URL,User,Pwd);
			stmt = conn.createStatement();
			i = stmt.executeUpdate(sql);
			System.out.print("�Ѹ��£�"+i+"������");
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(i!=0)
			Result = true;
		return Result;
	}
}
