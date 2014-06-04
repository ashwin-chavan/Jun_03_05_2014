package com.ds;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
	public static void print(Predicate<Integer> predicate,int[] numbers){
		for(int num : numbers){
			if(predicate.test(num))
				System.out.println(num);
		}
	}
	public static void main(String[] args) {

		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};		
		System.out.println("Even numbers");
		print(num->{ return num%2 == 0; },numbers);
	}
}
