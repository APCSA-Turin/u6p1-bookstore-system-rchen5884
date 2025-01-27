package com.example.project;

import java.util.Scanner;

public class BookStoreInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore store = new BookStore();

        while (true) {
            System.out.println("\n=== Bookstore Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add User");
            System.out.println("4. Remove User");
            System.out.println("5. View All Books");
            System.out.println("6. View All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                while (true) {
                    System.out.println("\n=== Add Book ===");
                    System.out.print("Enter book title (or type 'exit' to return to main menu): ");
                    String title = scanner.nextLine();
                    if (title.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year published: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    store.addBook(new Book(title, author, year, isbn, quantity));
                    System.out.println("Book added successfully!");
                }
            }

            if (choice == 2) {
                while (true) {
                    System.out.println("\n=== Remove Book ===");
                    System.out.print("Enter ISBN of the book to remove (or type 'exit' to return to main menu): ");
                    String isbn = scanner.nextLine();
                    if (isbn.equalsIgnoreCase("exit")) break;

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
                    if (!removed) System.out.println("Book not found!");
                }
            }

            if (choice == 3) {
                while (true) {
                    System.out.println("\n=== Add User ===");
                    System.out.print("Enter user name (or type 'exit' to return to main menu): ");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter user ID: ");
                    String id = scanner.nextLine();

                    store.addUser(new User(name, id));
                    System.out.println("User added successfully!");
                }
            }

            if (choice == 4) {
                while (true) {
                    System.out.println("\n=== Remove User ===");
                    System.out.print("Enter user ID to remove (or type 'exit' to return to main menu): ");
                    String id = scanner.nextLine();
                    if (id.equalsIgnoreCase("exit")) break;

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
                    if (!removed) System.out.println("User not found!");
                }
            }

            if (choice == 5) {
                while (true) {
                    System.out.println("\n=== Book List ===");
                    Book[] books = store.getBooks();
                    boolean isEmpty = true;

                    for (Book book : books) {
                        if (book != null) {
                            System.out.println(book.bookInfo());
                            isEmpty = false;
                        }
                    }

                    if (isEmpty) System.out.println("No books available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            if (choice == 6) {
                while (true) {
                    System.out.println("\n=== User List ===");
                    User[] users = store.getUsers();
                    boolean isEmpty = true;

                    for (User user : users) {
                        if (user != null) {
                            System.out.println(user.userInfo());
                            isEmpty = false;
                        }
                    }

                    if (isEmpty) System.out.println("No users available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            if (choice == 7) {
                System.out.println("Exiting program...");
                scanner.close();
                break;
            }
        }
    }
}
