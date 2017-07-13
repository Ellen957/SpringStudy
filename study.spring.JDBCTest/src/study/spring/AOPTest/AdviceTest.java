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
 * 基于AspectJ注解实现AOP
 */
@Aspect
public class AdviceTest {
	@Pointcut("execution(* study.spring.Imp.PersonServiceBean.*(..))")
	private void anyMethod(){}
	
	@Before("anyMethod()")
	public void before(){
		System.out.println("这是前置通知，在方法执行之前返回");
	}
	
	@After("anyMethod()")
	public void after(){
		System.out.println("这是后置通知，在方法执行后执行");
	}
	
	@AfterThrowing("anyMethod()")
	public void afterThrow(){
		System.out.println("异常通知，在方法抛出异常之后");
	}
	
	@AfterReturning("anyMethod()")
	public void afterReturn(){
		System.out.println("返回通知，在方法返回结果之后执行");
	}
	
	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("进入环绕通知，围绕着方法执行");
		Object object = pjp.proceed();//执行该方法
		System.out.println("退出方法");
		return object;
	}
}
