package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    /**
     * This variable initializes currentId to 99
     */
    private static String currentId = "99";

    /**
     * Since all methods are static, constructor is private
     */
    private IdGenerate() {}

    /**
     * Getter method that returns the ID
     * @return currentId
     */
    public static String getCurrentId() {
        return currentId;
    }

    /**
     * Void method that resets the Id back to 99
     */
    public static void reset(){currentId = "99";} 

    /**
     * Converts the String ID into a Integer and adds it by 1
     * Converts back to a String afterwards
     * @return
     */
    public static String generateID(){
        int number = Integer.parseInt(currentId);
        number = number + 1;
        currentId = Integer.toString(number);
        return currentId;
    } 
}