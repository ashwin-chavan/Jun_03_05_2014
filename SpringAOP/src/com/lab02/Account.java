package com.lab02;

import org.springframework.stereotype.Component;

@Component  
public class Account{
	private String accountNumber;
	private double balance = 1000.00;
	public String getAccountNumber(){
		return accountNumber;
	}
	public void setAccountNumber(String accNum){
		accountNumber = accNum;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}
}