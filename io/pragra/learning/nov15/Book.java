package io.pragra.learning.nov15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class Book {
    String title;
    String author;
    double price;
    int stock;

    public void sellBook(int quantity){
        if(quantity > stock){
            throw new InsufficientStockException("This book is not available");
        }
        else{
            stock = stock - quantity;
        }
    }
}
