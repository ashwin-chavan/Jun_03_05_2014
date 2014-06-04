package com.ds;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAspectWithoutAnnot {
	
	public void check(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
		Employee emp = (Employee)proceedingJoinPoint.getTarget();
		if(emp.getId().contains("123")){
			System.out.println(emp.getId() + " is blocked");
			return;
		}
		proceedingJoinPoint.proceed();
	}
	
	public void printTimeBeforeCallingWork(JoinPoint joinPoint){
		System.out.println("***Before calling " + joinPoint.getSignature());
	}
	public void printTimeAfterCallingWork(JoinPoint joinPoint){
		System.out.println("***After calling " + joinPoint.getSignature());
	}
}



