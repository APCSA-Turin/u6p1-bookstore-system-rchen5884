package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    /**
     * 
     * @param title The title of the book
     * @param author The author of the book
     * @param yearPublished The year the book was published
     * @param isbn The international standard book number
     * @param quantity The amount of books available
     */
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    /**
     * Generates a String with the title, author, year, isbn, and quantity
     * @return The String with the information of the Book
     */
    public String bookInfo() {//returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}