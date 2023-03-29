package Constructors;

// Constructors in Java

// 1) A constructor is a block of codes similar to the method.
//    It is called when an instance of the class is created.
// 2) It is a special type of method which is used to initialize the object.
// 3) Every time an object is created using the new() keyword,
//    at least one constructor is called.
// 4) It calls a default constructor if there is no constructor available in the class.
//    In such case, Java compiler provides a default constructor by default.

public class DefaultConstructor { // A Java Program to create and call a Default Constructor

    DefaultConstructor(){ // Creating Default Constructor

        System.out.println("Default Constructor is created"); // Displaying via Default Constructor
    }

    int id;
    String name;
    void display(){ // A method to display id and name

        System.out.println(id + " " + name); // Displaying values via a method
    }

    public static void main(String[] args) { // Main Method

        // Creating Objects
        DefaultConstructor d1 = new DefaultConstructor(); // Creating an object to print the message and call Display method
        d1.display(); // Calling the method to display values of objects

    }
}
