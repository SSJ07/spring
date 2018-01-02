package org.shri.models;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;
	private String state;
	private String country;
	
	public Address(){
		this.city = "Mumbai";
		this.state = "MH";
		this.country = "IN";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
