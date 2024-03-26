package main.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Entity
@Data
@NoArgsConstructor
public class Destination {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String type;
	private double price;
	@Autowired
	private Location location;
	
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
}
