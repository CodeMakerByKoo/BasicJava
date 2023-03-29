package Constructors;

// Java Parameterized Constructor
//
// 1) A constructor which has a specific number of parameters is called a parameterized constructor.
// 2) The parameterized constructor is used to provide different values to distinct objects.
//    However, you can provide the same values also.

public class ParameterizedConstructor { // Java Program to demonstrate the use of the parameterized constructor.

    int id;
    String name;

    ParameterizedConstructor(int i, String n){ // Creating a parameterized constructor

        id = i;
        name = n;
    }

    void display(){ // Method to display the values

        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        // Creating objects and passing values
        ParameterizedConstructor p1 = new ParameterizedConstructor(1,"Test1");
        ParameterizedConstructor p2 = new ParameterizedConstructor(2,"Test2");

        // Calling method to display the values of object
        p1.display();
        p2.display();

    }
}
