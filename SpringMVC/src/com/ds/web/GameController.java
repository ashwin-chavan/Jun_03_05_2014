package com.ds.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ds.domain.GuessingGame;

@Controller
public class GameController {
	
	@Autowired
	private GuessingGame guessingGame;
	
	@RequestMapping(value="/play",method=RequestMethod.POST)
	public String play(@RequestParam("guess") String enteredValue,HttpServletRequest request){
		int guess = Integer.parseInt(enteredValue);
		guessingGame.play(guess);
		int attempts = guessingGame.getAttempts();
		String message = guessingGame.getMessage();
		request.setAttribute("attempts", "Attempts: " + attempts );
		request.setAttribute("message", message);
		return "game";
	}
	@RequestMapping(value="/game",method=RequestMethod.GET)
	public String index(){
		return "game";
	}
}
