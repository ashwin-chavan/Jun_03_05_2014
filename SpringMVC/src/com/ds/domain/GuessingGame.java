package com.ds.domain;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class GuessingGame implements Serializable{
	private int target;
	private int attempts;
	private String message;
	private boolean gameOver;
	
	public void play(int guess){
		attempts++;
		if(guess > target)
			message = "Aim Lower";
		else if(guess < target)
			message = "Aim Higher";
		else if(guess == target){
			message = "You have got it!!!";
			gameOver = true;
		}
	}
	
	public boolean isGameOver() {
		return gameOver;
	}

	public GuessingGame(){
		target = (int)(Math.random()*100);
	}
	public int getAttempts() {
		return attempts;
	}
	public String getMessage() {
		return message;
	}
	
}
