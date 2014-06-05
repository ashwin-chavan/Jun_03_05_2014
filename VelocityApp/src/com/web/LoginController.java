package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.beans.LoginBean;

@Controller
@RequestMapping("/Login.spring")
public class LoginController
{
	
	@ModelAttribute("login")
	public LoginBean getLoginBean()
	{
		return new LoginBean();
	}
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String login(@ModelAttribute("login")LoginBean loginBean)
	{
		return loginBean.getUserName() + " logged in successfully";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index()
	{
		return new ModelAndView("login","welcome","Welcome to Velocity App");
	}
}
