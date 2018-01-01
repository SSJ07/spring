package org.shri.models;

public class Address {
	
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	public Address(){
		System.out.println("Initializing Address object.");
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + "]";
	}
	
	

}
