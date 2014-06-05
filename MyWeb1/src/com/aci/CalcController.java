package com.aci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calc")
public class CalcController {
	private Calculator calculator;
	
	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@RequestMapping("/mul")
	@ResponseBody
	public String multiply(@RequestParam("a") int a,@RequestParam("b") int b){
		return "Product : " + calculator.multiply(a,b);
	}
	@RequestMapping("/sub")
	@ResponseBody
	public String subtract(@RequestParam("a") int a,@RequestParam("b") int b){
		return "Difference : " + calculator.subtract(a,b);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(@RequestParam("a") int a,@RequestParam("b") int b){
		return "Sum : " + calculator.add(a,b);
	}
}
