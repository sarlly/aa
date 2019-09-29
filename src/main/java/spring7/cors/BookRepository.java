package spring7.cors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import spring7.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    @RestResource(path = "author",rel = "author")
    List<Book>findByAuthorContains(@Param("author")String author);
    @RestResource(path = "name",rel = "name")
    Book findByNameEquals(@Param("name") String name);
}
