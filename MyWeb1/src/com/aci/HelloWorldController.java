package com.aci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/hi",method=RequestMethod.GET)
	@ResponseBody
	public String hi(@RequestParam(required=false,value="name") String name){
		if(name == null)
			return "Pass a name parameter";
		return "Hi " + name;
	}
}






