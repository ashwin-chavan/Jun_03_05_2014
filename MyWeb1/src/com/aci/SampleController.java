package com.aci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping(value="/act1")
	public String action1(){
		//return "forward:act2";
		return "redirect:act3";
	}
	@RequestMapping(value="/act2")
	@ResponseBody
	public String action2(){
		return "You are in action2";
	}
	
	@RequestMapping(value="/act3")
	@ResponseBody
	public String action3(){
		return "You are in action 3";
	}
}
