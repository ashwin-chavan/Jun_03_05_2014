package com.aci;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int add(int num1,int num2){
		return num1 + num2;
	}
	public int subtract(int num1,int num2){
		return num1 - num2;
	}
	public int multiply(int num1,int num2){
		return num1 * num2;
	}
}
