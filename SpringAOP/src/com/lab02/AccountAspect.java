package com.lab02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountAspect {
	
	@Autowired
	private LogUtility logUtility;
	
	@After("execution(* Account.deposit(..)) || execution(* Account.withdraw(..))")
	public void printBalance(JoinPoint joinPoint){
		Account account = (Account)joinPoint.getTarget();
		System.out.println("***Balance: " + account.getBalance());
	}
	@Around("execution(* Account.withdraw(..))")
	public void checkWithdrawAmount(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
		Account account = (Account)proceedingJoinPoint.getTarget();
		double amount = 
				Double.parseDouble(proceedingJoinPoint.getArgs()[0].toString());
		String errorMessage = null;
		if(amount < 500)
			errorMessage = "***Withdraw denied for Rs." + amount;
		else if(account.getBalance() < amount)
			errorMessage = "***Insufficient balance. Withdraw denied for Rs." + amount;
		else if((account.getBalance() - amount) < 1000)
			errorMessage = "***Minimum balance should be 1000. Withdraw denied for Rs." + amount;
		
		if(errorMessage == null)
			proceedingJoinPoint.proceed();
		else{
			logUtility.writeToLogFile("accounts.log", errorMessage);
			System.out.println(errorMessage);
		}
	}
}





