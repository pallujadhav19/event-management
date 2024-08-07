package ccom.codewithdurgesh.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccom.codewithdurgesh.event.entity.Organizer;
import ccom.codewithdurgesh.event.repository.OrganizerRepository;

@Service
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public List<Organizer> getAllOrganizers() {
        return organizerRepository.findAll();
    }

    public Optional<Organizer> getOrganizerById(Long id) {
        return organizerRepository.findById(id);
    }

    public Organizer updateOrganizer(Long id, Organizer organizer) {
        organizer.setId(id);
        return organizerRepository.save(organizer);
    }

    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }

	public List<Organizer> getOrganizersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}