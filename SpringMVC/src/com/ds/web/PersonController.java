package com.ds.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.domain.Person;

@Controller
@RequestMapping("/people")
public class PersonController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("p1", new Person());
		return "people";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String index(@ModelAttribute("p1") Person person){
		return "Hello " + person.getName() + ", Age: " + person.getAge();
	}
	
	
	
	
}
