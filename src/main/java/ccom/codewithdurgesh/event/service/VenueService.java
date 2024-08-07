package ccom.codewithdurgesh.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccom.codewithdurgesh.event.entity.Venue;
import ccom.codewithdurgesh.event.repository.VenueRepository;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public List<Venue> getAllVenues() {
        return venueRepository.findAll();
    }

    public Optional<Venue> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public Venue updateVenue(Long id, Venue venue) {
        venue.setId(id);
        return venueRepository.save(venue);
    }

    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }

	public List<Venue> getVenuesByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}
}
