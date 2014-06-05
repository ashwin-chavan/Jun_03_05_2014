package com.aci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("/sq/{a}")
	@ResponseBody
	public String square(@PathVariable("a")int a){
		return "" + (a*a);
	}
	@RequestMapping("/sum/{a}/{b}")
	@ResponseBody
	public String add(@PathVariable("a")int a,@PathVariable("b")int b){
		return "Sum " + (a+b);
	}
}
