package com.example.project;

/**
 * Represents a Book with details such as title, author, year published, ISBN, and quantity available.
 * Provides methods to get and set these attributes, as well as a method to display the book's information.
 */
public class Book {
    
    // Book attributes
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    /**
     * Constructs a Book object with the specified details.
     * 
     * @param title The title of the book.
     * @param author The author of the book.
     * @param yearPublished The year the book was published.
     * @param isbn The international standard book number (ISBN) of the book.
     * @param quantity The quantity of the book available in stock.
     */
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    /**
     * Retrieves the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets a new title for the book.
     * 
     * @param newTitle The new title of the book.
     */
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    /**
     * Retrieves the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets a new author for the book.
     * 
     * @param newAuthor The new author of the book.
     */
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    /**
     * Retrieves the year the book was published.
     * 
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets a new publication year for the book.
     * 
     * @param newYear The new year the book was published.
     */
    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }

    /**
     * Retrieves the ISBN of the book.
     * 
     * @return The ISBN of the book.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets a new ISBN for the book.
     * 
     * @param newIsbn The new ISBN of the book.
     */
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    /**
     * Retrieves the quantity of the book available in stock.
     * 
     * @return The quantity of the book.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets a new quantity for the book.
     * 
     * @param newQuantity The new quantity of the book.
     */
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    /**
     * Generates a string containing the book's details such as title, author, year, ISBN, and quantity.
     * 
     * @return A string representation of the book's details.
     */
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    }
}
