package com.spring.kodilla.forum;

import com.spring.kodilla.shape.Square;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;


    public ForumUser() {
        this.username = "John Smith";

    }

    public String getUsername() {
        return username;
    }
}
