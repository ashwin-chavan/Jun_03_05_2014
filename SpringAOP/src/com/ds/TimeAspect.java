package com.ds;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAspect {
	@Pointcut("execution(* Employee.work(..))")
	private void logTime(){}
	
	@Around("logTime()")
	public void check(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
		Employee emp = (Employee)proceedingJoinPoint.getTarget();
		if(emp.getId().contains("123")){
			System.out.println(emp.getId() + " is blocked");
			return;
		}
		proceedingJoinPoint.proceed();
	}
	
	@Before("execution(* Employee.work(..))")
	public void printTimeBeforeCallingWork(JoinPoint joinPoint){
		System.out.println("***Before calling " + joinPoint.getSignature());
	}
	@After("logTime()")
	public void printTimeAfterCallingWork(JoinPoint joinPoint){
		System.out.println("***After calling " + joinPoint.getSignature());
	}
}



