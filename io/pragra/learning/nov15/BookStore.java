package io.pragra.learning.nov15;


import java.util.ArrayList;
import java.util.List;

public class BookStore {
    String name;
    List<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println(book + " added to the store successfully!");
    }

    public void listBooks(){
        System.out.println("The list of books available in " + name + " is shown below:");
        for(Book book : books){
            System.out.println(book.getTitle() + " by "+ book.getAuthor() + ":$" + book.getPrice() + "("+ book.getStock() + "in stock)");
        }
    }

    public void purchaseBook(String title, int quantity, boolean isMember){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                try{
                    double price = book.getPrice();
                    if(isMember){
                        MemberDiscount discount = new MemberDiscount();
                        price = price - discount.applyDiscount(price);
                    }
                    book.sellBook(quantity);
                    System.out.println("Purchased " + quantity + " copies of \"" + book.getTitle() + "\" at $" + price + " each.");
                    return;
                } catch(InsufficientStockException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Book \""+ title+ "\" not found.");
        }
    }
}
