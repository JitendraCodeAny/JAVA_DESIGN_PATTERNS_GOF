package com.jitendra.dp.usecase.singleton;

// Testing Singleton Pattern - categorized under GOF Creational Patterns
// Library Management System Application class demonstrates singleton pattern use case in Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.listBooks();
    }
}
