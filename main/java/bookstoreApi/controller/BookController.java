package bookstoreApi.controller;

import bookstoreApi.domain.Book;
import bookstoreApi.domain.User;
import bookstoreApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository bookRepository;


    @PostMapping("/newBook")
    public Book createBook(@Valid @RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable(value = "id") String isbnNumber,
                           @Valid @RequestBody Book bookDetails) {

        bookRepository.findById(isbnNumber).orElseThrow(() -> new Exception("This Book does not exist!"));

        bookDetails.setId(isbnNumber);
        Book updatedBook = bookRepository.save(bookDetails);
        return updatedBook;
    }

    @PutMapping("/book/{id}")
    public Book returnBook(@PathVariable(value = "id") String isbnNumber) {

        Book bookDetails = bookRepository.findById(isbnNumber).orElseThrow(() -> new Exception("This Book does not exist!"));

        bookDetails.setAvailableForLoan(1);
        Book returnedBook = bookRepository.save(bookDetails);
        return returnedBook;
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") String bookId, String userName) throws Exception {
        User user = userRepository.findByUserName(userName);
        if (user.getUserRole() != "ADMIN") {
            throw new Exception("You are not allowed to delete!");
        } else {
            Book book = bookRepository.findById(bookId).orElseThrow(() -> {
                throw new Exception("This Book does not exist!");
                }
            );

            bookRepository.delete(book);
            return ResponseEntity.ok().build();
        }
    }



}
