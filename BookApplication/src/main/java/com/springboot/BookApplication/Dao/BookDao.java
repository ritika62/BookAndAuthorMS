package com.springboot.BookApplication.Dao;

import com.springboot.BookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookDao extends JpaRepository<Book,Long>, JpaSpecificationExecutor<Book> {
}
