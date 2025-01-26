package com.example.project;

/**
 * Represents a User who has a name, ID, and a collection of books they possess.
 * Provides methods to get and set these attributes, as well as methods to display the user's information and book list.
 */
public class User {

    private String name;  // The user's name
    private String Id;    // The user's unique ID
    private Book[] book = new Book[5];  // Array to store books the user possesses

    /**
     * Constructs a User object with the specified name and ID.
     * 
     * @param name The name of the user.
     * @param Id The unique ID of the user.
     */
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    /**
     * Retrieves the name of the user.
     * 
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name for the user.
     * 
     * @param newName The new name of the user.
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Retrieves the ID of the user.
     * 
     * @return The ID of the user.
     */
    public String getId() {
        return Id;
    }

    /**
     * Sets a new ID for the user.
     * 
     * @param newId The new ID of the user.
     */
    public void setId(String newId) {
        Id = newId;
    }

    /**
     * Retrieves the list of books the user possesses.
     * 
     * @return An array of Book objects representing the books the user has.
     */
    public Book[] getBooks() {
        return book;
    }

    /**
     * Sets a new list of books for the user.
     * 
     * @param newBook An array of Book objects to set for the user.
     */
    public void setBooks(Book[] newBook) {
        book = newBook;
    }

    /**
     * Generates a string representation of the user's book list.
     * If the list is empty, the string will indicate "empty".
     * 
     * @return A string listing the books the user has. If no books, returns "empty".
     */
    public String bookListInfo() {
        String bookList = "";
        for (Book books : book) {
            if (books == null) {
                bookList += "empty";
                bookList += "\n";
            } else {
                bookList += books.bookInfo();
                bookList += "\n";
            }
        }
        return bookList;
    }

    /**
     * Generates a string containing the user's name, ID, and their book list.
     * 
     * @return A string representation of the user's details.
     */
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }
}
