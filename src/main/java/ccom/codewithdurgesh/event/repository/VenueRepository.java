package ccom.codewithdurgesh.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ccom.codewithdurgesh.event.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
