package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepository extends CrudRepository<Author, Long> {



}
