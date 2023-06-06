/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

/**
 *
 * @author Thanuja
 */
public class Book {

    private String title;
    private String author;
    private String category;
    private double price;
    private int quantity;

    public Book(String title, String author, String category, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public  String getTitle() {
        return title;
    }

    public  String getAuthor() {
        return author;
    }

    public  String getCategory() {
        return category;
    }

    public  double getPrice() {
        return price;
    }

    public  int getQuantity() {
        return quantity;
    }
}
