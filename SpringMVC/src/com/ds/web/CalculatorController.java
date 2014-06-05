package com.ds.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

	@RequestMapping("/sq/{a}")
	@ResponseBody
	public String square(@PathVariable("a")int num){
		return (num*num) + "";
	}
	@RequestMapping("/add/{a}/{b}")
	@ResponseBody
	public String add(@PathVariable("a")int num1,@PathVariable("b")int num2){
		return (num1+num2) + "";
	}
	@RequestMapping("sub/{a}/{b}")
	@ResponseBody
	public String subtract(@PathVariable("a")int num1,@PathVariable("b")int num2){
		return (num1-num2) + "";
	} 
}
