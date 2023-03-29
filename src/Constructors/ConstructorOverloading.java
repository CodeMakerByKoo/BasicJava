package Constructors;

// Constructor Overloading in Java

// 1) A constructor is just like a method but without return type.
//    It can also be overloaded like Java methods.
// 2) Constructor overloading in Java is a technique of having more than
//    one constructor with different parameter lists
// 3) They are arranged in a way that each constructor performs a different task.
// 4) They are differentiated by the compiler by the number of parameters in the list and their types.

public class ConstructorOverloading { // Java program to overload constructors

    int id;
    String name;
    int age;

    // Creating two argument constructor
    ConstructorOverloading(int i, String n){

        id = i;
        name = n;

    }

    // Creating three argument constructor
    ConstructorOverloading(int i, String n, int a){

        id = i;
        name = n;
        age = a;

    }

    void display(){

        System.out.println(id + " " + name+ " " + age);
    }

    public static void main(String[] args) {

        ConstructorOverloading over1 = new ConstructorOverloading(1,"test1"); // Creating an object for two argument constructor
        ConstructorOverloading over2 = new ConstructorOverloading(2,"test2",3); // Creating an object for three argument constructor

        over1.display(); // Calling first overloaded Constructor
        over2.display(); // Calling second overloaded Constructor

    }
}
