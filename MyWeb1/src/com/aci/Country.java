package com.aci;

public class Country {
	
	public Country() {
	}
	public Country(String name) {
		this.name = name;
		if("India".equalsIgnoreCase(name))
			this.capital = "New Delhi";
		else if("US".equalsIgnoreCase(name))
			this.capital = "Washington";
		else
			this.capital = "Not available in DB";
	}
	private String name;
	private String capital;
	public String getCapital() {
		return capital;
	}
	public String getName() {
		return name;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public void setName(String name) {
		this.name = name;
	}
}
