package com.example.demo.venuecontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.venue.Venue;
import com.example.demo.venueservice.VenueService;
@RestController
@RequestMapping("ventor/api/v1.0")
public class VenueController {
	
	@Autowired
     private VenueService service;
	@GetMapping("/all")
    List<Venue>getAllVenue(){ 
	   return service.getAllVenue();
    }
        @GetMapping("all/{id}")
        
        Optional<Venue>VenueById(@PathVariable Integer id){
        	return service.getVenueById(id);
        }
        @PostMapping("/all")
	     Venue addNewVenue(@RequestBody Venue venue){
	        return service.addNewVenue(venue);
	    }



	 @PutMapping("/all/{id}") 
	 void updateVenue(@RequestBody Venue venue){ 
		 service.updateVenue(venue);
		 }
	 }

