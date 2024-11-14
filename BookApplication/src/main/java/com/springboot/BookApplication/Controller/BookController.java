package com.springboot.BookApplication.Controller;
import com.springboot.BookApplication.AuthorInfo;
import com.springboot.BookApplication.Entity.Book;
import com.springboot.BookApplication.Service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    @PostMapping("/books/filter")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> filterBooks(@RequestBody RequestPojo requestPojo) {

        return bookService.filterBooks(requestPojo);
    }

    @PostMapping("/authors/filter")
    @ResponseStatus(HttpStatus.OK)
    public List<AuthorInfo> filterAuthors(@RequestBody AuthorPojo authorPojo) {
        return bookService.filterAuthors(authorPojo);
    }
}




