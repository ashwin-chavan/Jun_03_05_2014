package com.old;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class TimeAspect implements MethodBeforeAdvice,
				AfterReturningAdvice,
				MethodInterceptor{
	//@Before
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("***BEFORE calling " + method.getName());
	}
	//@After
	public void afterReturning(Object arg0, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("****AFTER calling " + method.getName());
	}
	//@Around
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		return methodInvocation.proceed();
	}

}
