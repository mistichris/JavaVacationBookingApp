package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.beans.Destination;
import main.repository.DestinationRepository;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Mar 26, 2024
 */
@Controller
public class WebController {
	@Autowired
	DestinationRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllDestinations(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewDestination(model);
		}
		
		model.addAttribute("destinations", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputDestination")
	public String addNewDestination(Model model) {
		Destination dest = new Destination();
		model.addAttribute("newDestination", dest);
		return "input";
	}
	
	@PostMapping("/inputDestination")
	public String addNewContact(@ModelAttribute Destination dest, Model model) {
		repo.save(dest);
		return viewAllDestinations(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateDestination(@PathVariable("id") long id, Model model) {
		Destination dest = repo.findById(id).orElse(null);
		model.addAttribute("newDestination", dest);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseDestination(Destination dest, Model model) {
		repo.save(dest);
		return viewAllDestinations(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Destination dest = repo.findById(id).orElse(null);
		repo.delete(dest);
		return viewAllDestinations(model);
	}
}
