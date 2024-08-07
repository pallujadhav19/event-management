package ccom.codewithdurgesh.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ccom.codewithdurgesh.event.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	//find event by venueId
    List<Event> findByVenueId(Long venueId);
    
    //find event by organizerId
    List<Event> findByOrganizerId(Long organizerId);
}