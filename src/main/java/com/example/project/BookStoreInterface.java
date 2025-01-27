package com.example.project;

import java.util.Scanner;

public class BookStoreInterface {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create an instance of the BookStore to manage books and users
        BookStore store = new BookStore();

        // Main loop for the program
        while (true) {
            // Display the main menu
            System.out.println("\n=== Bookstore Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add User");
            System.out.println("4. Remove User");
            System.out.println("5. View All Books");
            System.out.println("6. View All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Get user input for menu choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Option to add a book
            if (choice == 1) {
                while (true) {
                    System.out.println("\n=== Add Book ===");
                    // Prompt the user for book details
                    System.out.print("Enter book title (or type 'exit' to return to main menu): ");
                    String title = scanner.nextLine();
                    if (title.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year published: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Add the book to the store
                    store.addBook(new Book(title, author, year, isbn, quantity));
                    System.out.println("Book added successfully!");
                }
            }

            // Option to remove a book
            if (choice == 2) {
                while (true) {
                    System.out.println("\n=== Remove Book ===");
                    // Prompt for ISBN of the book to remove
                    System.out.print("Enter ISBN of the book to remove (or type 'exit' to return to main menu): ");
                    String isbn = scanner.nextLine();
                    if (isbn.equalsIgnoreCase("exit")) break;

                    // Search for the book and remove it if found
                    Book[] books = store.getBooks();
                    boolean removed = false;
                    for (Book book : books) {
                        if (book != null && book.getIsbn().equals(isbn)) {
                            store.removeBook(book);
                            removed = true;
                            System.out.println("Book removed successfully!");
                            break;
                        }
                    }
                    // If the book wasn't found, display a message
                    if (!removed) System.out.println("Book not found!");
                }
            }

            // Option to add a user
            if (choice == 3) {
                while (true) {
                    System.out.println("\n=== Add User ===");
                    // Prompt for user details
                    System.out.print("Enter user name (or type 'exit' to return to main menu): ");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter user ID: ");
                    String id = scanner.nextLine();

                    // Add the user to the store
                    store.addUser(new User(name, id));
                    System.out.println("User added successfully!");
                }
            }

            // Option to remove a user
            if (choice == 4) {
                while (true) {
                    System.out.println("\n=== Remove User ===");
                    // Prompt for user ID to remove
                    System.out.print("Enter user ID to remove (or type 'exit' to return to main menu): ");
                    String id = scanner.nextLine();
                    if (id.equalsIgnoreCase("exit")) break;

                    // Search for the user and remove them if found
                    User[] users = store.getUsers();
                    boolean removed = false;
                    for (User user : users) {
                        if (user != null && user.getId().equals(id)) {
                            store.removeUser(user);
                            removed = true;
                            System.out.println("User removed successfully!");
                            break;
                        }
                    }
                    // If the user wasn't found, display a message
                    if (!removed) System.out.println("User not found!");
                }
            }

            // Option to view all books
            if (choice == 5) {
                while (true) {
                    System.out.println("\n=== Book List ===");
                    Book[] books = store.getBooks();
                    boolean isEmpty = true;

                    // Display all books
                    for (Book book : books) {
                        if (book != null) {
                            System.out.println(book.bookInfo());
                            isEmpty = false;
                        }
                    }

                    // If no books are available, display a message
                    if (isEmpty) System.out.println("No books available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            // Option to view all users
            if (choice == 6) {
                while (true) {
                    System.out.println("\n=== User List ===");
                    User[] users = store.getUsers();
                    boolean isEmpty = true;

                    // Display all users
                    for (User user : users) {
                        if (user != null) {
                            System.out.println(user.userInfo());
                            isEmpty = false;
                        }
                    }

                    // If no users are available, display a message
                    if (isEmpty) System.out.println("No users available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            // Option to exit the program
            if (choice == 7) {
                System.out.println("Exiting program...");
                scanner.close(); // Close the scanner
                break; // Exit the main loop
            }
        }
    }
}
