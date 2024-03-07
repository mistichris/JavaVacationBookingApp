package main.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.beans.Destination;
import main.beans.Location;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Destination destination() {
		Destination bean = new Destination();
		return bean;
	}
	
	@Bean
	public Location location() {
		Location bean = new Location();
		return bean;
	}
}
