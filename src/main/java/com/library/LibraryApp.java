package com.library;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Books Issued: ");
        int books = sc.nextInt();

        System.out.print("Days: ");
        int days = sc.nextInt();

        User user = new User(name, id, books, days);

        LibraryService service = new LibraryService();
        service.display(user);
    }
}

