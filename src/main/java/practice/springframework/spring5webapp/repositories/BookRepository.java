package practice.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.spring5webapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
