package com.aci;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mobile")
public class MobileController {
	
	@RequestMapping("/input")
	@ResponseBody
	public String passJson(@RequestBody Country country){
		return "You passed " + country.getName() + ", " + country.getCapital();
	}
	
	@RequestMapping(value="/plain")
	@ResponseBody
	public String plain(){
		return "Plain output";
	}
	@RequestMapping(value="/all",produces="application/json")
	@ResponseBody
	public List<Country> getAllCountries(){
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("India"));
		countries.add(new Country("US"));
		return countries;
	}
	@RequestMapping(value="/info",produces="application/json")
	@ResponseBody
	public Country getInfo(@RequestParam("name") String country){
		return new Country(country);
	}
}
