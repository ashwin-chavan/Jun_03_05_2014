package com.aci;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFormController {

	@RequestMapping(value="/index",method=RequestMethod.POST)
	//@ResponseBody
	public String processForm(@RequestParam("firstname")String firstName,
			@RequestParam("lastname")String lastName,HttpSession session){
		String message = "Hi " + firstName + " " + lastName;
		session.setAttribute("message",message);
		return "results";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	
}
