package com.example.demo.venuerepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.venue.Venue;



	@Repository
	public interface VenueRepository extends CrudRepository<Venue, Integer >{
		//List<Venue> findByVenueId(Integer Id);
}
