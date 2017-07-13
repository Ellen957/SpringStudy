/**
 * 
 */
package study.spring.AOPTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Administrator
 * ����AspectJע��ʵ��AOP
 */
@Aspect
public class AdviceTest {
	@Pointcut("execution(* study.spring.Imp.PersonServiceBean.*(..))")
	private void anyMethod(){}
	
	@Before("anyMethod()")
	public void before(){
		System.out.println("����ǰ��֪ͨ���ڷ���ִ��֮ǰ����");
	}
	
	@After("anyMethod()")
	public void after(){
		System.out.println("���Ǻ���֪ͨ���ڷ���ִ�к�ִ��");
	}
	
	@AfterThrowing("anyMethod()")
	public void afterThrow(){
		System.out.println("�쳣֪ͨ���ڷ����׳��쳣֮��");
	}
	
	@AfterReturning("anyMethod()")
	public void afterReturn(){
		System.out.println("����֪ͨ���ڷ������ؽ��֮��ִ��");
	}
	
	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("���뻷��֪ͨ��Χ���ŷ���ִ��");
		Object object = pjp.proceed();//ִ�и÷���
		System.out.println("�˳�����");
		return object;
	}
}
