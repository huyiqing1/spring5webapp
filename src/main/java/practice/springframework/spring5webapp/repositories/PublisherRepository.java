package practice.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.spring5webapp.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
