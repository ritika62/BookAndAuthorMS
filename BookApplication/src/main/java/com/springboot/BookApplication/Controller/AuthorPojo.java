package com.springboot.BookApplication.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorPojo {
    private String authorName;
    private String email;
    private String nationality;
}
