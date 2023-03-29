package Constructors;

// Java Copy Constructor

// 1) There is no copy constructor in Java. However,
//    we can copy the values from one object to another like copy constructor in C++.
// 2) There are many ways to copy the values of one object into another in Java. They are:
//    a. By constructor
//    b. By assigning the values of one object into another
//    c. By clone() method of Object class

public class CopyConstructor { // Java program to initialize the values from one object to another object.

    int id;
    String name;

    CopyConstructor(int i, String n){   // Constructor to initialize integer and string

        id = i;
        name = n;
    }

    CopyConstructor(CopyConstructor c){  // Constructor to initialize another object

        id = c.id;
        name = c.name;
    }

    void display(){

        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        CopyConstructor c1 = new CopyConstructor(1, "test");
        CopyConstructor c2 = new CopyConstructor(c1);

        c1.display();
        c2.display();

    }
}
