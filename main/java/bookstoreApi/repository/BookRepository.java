package bookstoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookstoreApi.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}