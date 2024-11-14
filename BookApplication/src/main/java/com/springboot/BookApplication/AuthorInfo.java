package com.springboot.BookApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorInfo
{
        private Long id;
        private String authorName;
        private String email;
        private String nationality;
    }



