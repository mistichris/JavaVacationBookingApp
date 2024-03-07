package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import main.beans.Destination;
import main.beans.Location;
import main.controller.BeanConfiguration;
import main.repository.DestinationRepository;

@SpringBootApplication
public class VacationDestinationsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VacationDestinationsApplication.class, args);
	}
	
	@Autowired
	DestinationRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Destination saktiDest = appContext.getBean("destination", Destination.class);
		saktiDest.setName("Sakti");
		saktiDest.setType("Full Local");
		saktiDest.setPrice(5000.00);
		
		Location saktiLoc = new Location(null, "Sakti", "Ladakh", "India");
		
		saktiDest.setLocation(saktiLoc);
		
		repo.save(saktiDest);
		
		List<Destination> allDestinations = repo.findAll();
		for(Destination dest : allDestinations) {
			System.out.println(dest.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
