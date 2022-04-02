package practice.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.spring5webapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
