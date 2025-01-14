package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5];
    private User[] users = new User[10];

    //requires 1 empty constructor
    private BookStore() {}

    public User[] getUsers(){
        return users;
    }

    public void setUsers(User[] newUsers){
        users = newUsers;
    }

    public Book[] getBooks(){
        return books;
    }

    public void addUser(User user){} 

    public void removeUser(User user){}

    public void consolidateUsers(){
        int idx = 0;
        Horse[] consolidateHorses = new Horse[stalls.length];
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null) {
                consolidateHorses[idx] = stalls[i];
                idx++;}}
        stalls = consolidateHorses;}

    }

    // public void addBook(Book book){}

    // public void insertBook(Book book, int index){}

    // public void removeBook(Book book){}
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}