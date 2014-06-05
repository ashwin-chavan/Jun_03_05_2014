package com.ds.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/page1")
	public String getPage1(String name,HttpSession session,HttpServletRequest req){
		String message = "Hi "+ name;
		session.setAttribute("message", message);
		return "mypage1";
	}
}






