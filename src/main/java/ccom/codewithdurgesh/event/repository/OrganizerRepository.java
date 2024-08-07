package ccom.codewithdurgesh.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ccom.codewithdurgesh.event.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
