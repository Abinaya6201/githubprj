package com.example.demo.venueservice;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.venue.Venue;
import com.example.demo.venuerepository.VenueRepository;


@Service
public class VenueService {
	@Autowired 
   private VenueRepository repo;
    	public List<Venue> getAllVenue(){
            return ((List)(repo.findAll()));
        }
         public Optional<Venue> getVenueById(Integer id){
            return repo.findById(id);
        }

         public Venue addNewVenue(Venue venue){
            return repo.save(venue);
        }

		
     public  void updateVenue(Venue venue){
            repo.save(venue);
        }
}