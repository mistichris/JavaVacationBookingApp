package main.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Entity
public class Destination {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String type;
	private double price;
	@Autowired
	private Location location;
	
	public Destination() {
		
	}
	
	public Destination(String name) {
		this.name = name;
	}
	
	public Destination(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public Destination(long id, String name, String type, double price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Destination [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", location="
				+ location + "]";
	}
}
