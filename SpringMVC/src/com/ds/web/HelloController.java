package com.ds.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/dummy")
	public String dummy(){
		return "cool";
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public String add(@RequestParam("a")int num1,@RequestParam("b")int num2){
		return (num1+num2) + "";
	}
	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello(String name){
		return "Hello " + name;
	}
}





