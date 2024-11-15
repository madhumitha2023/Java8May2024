package io.pragra.learning.nov15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore("Lakshmi Book Store");

        bookstore.addBook(new Book("Little kid", "Viaansh", 70.75, 10));
        bookstore.addBook(new Book("Effective Java", "Joshua Bloch", 45.00, 10));
        bookstore.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", 55.00, 5));

        bookstore.listBooks();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to purchase: ");
        String title = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();

        bookstore.purchaseBook(title, quantity, isMember);

        bookstore.listBooks();
    }
}
