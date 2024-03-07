package main.beans;

import jakarta.persistence.Embeddable;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Embeddable
public class Location {
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	
	public Location() {
		
	}
	
	public Location(String streetAddress, String city, String state, String country) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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
		return "Location [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
}
