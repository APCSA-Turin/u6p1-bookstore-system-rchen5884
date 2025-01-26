package com.example.project;

/**
 * Represents a Bookstore that manages a collection of books and users.
 * The bookstore allows for adding/removing books and users, and consolidating them.
 */
public class BookStore {

    private Book[] books = new Book[5];  // Array to store books
    private User[] users = new User[10];  // Array to store users

    /**
     * Default constructor for the BookStore class.
     */
    public BookStore() {}

    /**
     * Retrieves the list of users in the bookstore.
     * 
     * @return an array of User objects representing all users.
     */
    public User[] getUsers() {
        return users;
    }

    /**
     * Sets the list of users for the bookstore.
     * 
     * @param newUsers an array of User objects to set.
     */
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }

    /**
     * Retrieves the list of books in the bookstore.
     * 
     * @return an array of Book objects representing all books.
     */
    public Book[] getBooks() {
        return books;
    }

    /**
     * Adds a user to the bookstore. If there is space available, the user will be added to the first available slot.
     * 
     * @param user the User object to add.
     */
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    /**
     * Removes a user from the bookstore. If the user is found, it will be removed and the list will be consolidated.
     * 
     * @param user the User object to remove.
     */
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                break;
            }
        }
        consolidateUsers(); // Optional: Automatically consolidate after removal
    }

    /**
     * Consolidates the users array by removing any null entries and shifting the remaining users.
     * This method helps keep the user array compact.
     */
    public void consolidateUsers() {
        int idx = 0;
        User[] consolidatedUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                consolidatedUsers[idx] = users[i];
                idx++;
            }
        }
        users = consolidatedUsers;
    }

    /**
     * Adds a book to the bookstore. If there is space available, the book will be added to the first available slot.
     * 
     * @param book the Book object to add.
     */
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    /**
     * Inserts a book at the specified index. If the index is already occupied, the existing books will be shifted to make space.
     * 
     * @param book the Book object to insert.
     * @param index the index at which the book should be inserted.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= books.length).
     */
    public void insertBook(Book book, int index) {
        if (index < 0 || index >= books.length) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        if (books[index] == null) {
            books[index] = book;
        } else {
            for (int i = books.length - 1; i > index; i--) {
                books[i] = books[i - 1];
            }
            books[index] = book;
        }
    }

    /**
     * Removes a book from the bookstore by decreasing its quantity. If the quantity reaches 0, the book will be removed entirely.
     * 
     * @param book the Book object to remove.
     */
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity() - 1);
                if (books[i].getQuantity() == 0) {
                    books[i] = null;
                    consolidateBooks();
                }
            }
        }
    }
    
    /**
     * Consolidates the books array by removing any null entries and shifting the remaining books.
     * This method helps keep the book array compact.
     */
    public void consolidateBooks() {
        int bookCount = 0;
        for (Book book : books) {
            if (book != null) {
                bookCount++;
            }
        }
        Book[] tempBooks = new Book[bookCount];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                tempBooks[index] = books[i];
                index++;
            }
        }
        books = tempBooks;
    }
}
   
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

