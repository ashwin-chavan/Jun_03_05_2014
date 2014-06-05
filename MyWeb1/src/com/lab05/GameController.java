package com.lab05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/game")
public class GameController {
	
	private GuessingGame guessingGame;
	@Autowired
	public void setGuessingGame(GuessingGame guessingGame) {
		this.guessingGame = guessingGame;
	}
	@RequestMapping(method=RequestMethod.POST)
	public String play(@RequestParam("guess")String number,HttpSession session){
		int guess = Integer.parseInt(number);
		guessingGame.play(guess);
		session.setAttribute("attempts","Attempts: " + guessingGame.getAttempts());
		session.setAttribute("message",guessingGame.getMessage());
		return "lab05/index";
	}
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "lab05/index";
	}
}
