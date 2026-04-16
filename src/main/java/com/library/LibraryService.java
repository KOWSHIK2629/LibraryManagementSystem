package com.library;

public class LibraryService {

    public int calculateFine(int days) {
        int allowedDays = 7;
        int finePerDay = 10;

        if (days > allowedDays) {
            return (days - allowedDays) * finePerDay;
        }
        return 0;
    }

    public void display(User user) {
        int fine = calculateFine(user.days);

        System.out.println("User Name: " + user.name);
        System.out.println("User ID: " + user.id);
        System.out.println("Books Issued: " + user.booksIssued);
        System.out.println("Days: " + user.days);
        System.out.println("Fine: " + fine);
    }
}
