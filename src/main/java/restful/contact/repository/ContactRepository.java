package restful.contact.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import restful.contact.entity.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
	Page<Contact> findAll(Pageable pageable);
	List<Contact> findAll();
}
