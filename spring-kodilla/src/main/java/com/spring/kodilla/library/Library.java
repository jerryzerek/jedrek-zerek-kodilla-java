package com.spring.kodilla.library;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

public final class Library {
    private LibraryDbController libraryDbController;

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void loadData() {
        libraryDbController.loadData();
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }
}
