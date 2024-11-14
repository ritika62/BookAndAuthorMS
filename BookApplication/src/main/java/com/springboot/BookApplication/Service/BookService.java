package com.springboot.BookApplication.Service;

import com.springboot.BookApplication.AuthorInfo;
import com.springboot.BookApplication.Controller.AuthorPojo;
import com.springboot.BookApplication.Controller.RequestPojo;
import com.springboot.BookApplication.Dao.BookDao;
import com.springboot.BookApplication.Entity.Book;
import com.springboot.BookApplication.Specification.BookSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
@AllArgsConstructor
public class BookService {

    private final BookDao bookDao;
    private final WebClient webClient;

    public List<Book> filterBooks(RequestPojo requestPojo) {
        Specification<Book> spec = BookSpecification.filterBooks(requestPojo);

        return bookDao.findAll(spec);
    }
   /* public List<AuthorInfo> filterAuthors(AuthorPojo authorPojo) {
        RestTemplate restTemp = new RestTemplate();
        String URL = "http://localhost:8282/authors/filter";
        List<AuthorInfo> authorInfo = restTemp.postForObject(URL, authorPojo, List.class);
        return authorInfo;
    }*/

          public List<AuthorInfo> filterAuthors(AuthorPojo authorPojo) {
              return webClient.post()
                      .uri("http://localhost:8282/authors/filter")
                      .bodyValue(authorPojo)
                      .retrieve()
                      .bodyToFlux(AuthorInfo.class)
                      .collectList()
                      .block();


          }
    }


