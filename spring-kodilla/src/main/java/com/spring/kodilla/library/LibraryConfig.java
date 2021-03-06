package com.spring.kodilla.library;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    @Bean
    public Library getLibrary() {
        return new Library(libraryDbController());
    }

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}
