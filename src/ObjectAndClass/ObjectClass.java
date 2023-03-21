package ObjectAndClass;
//Object and Class Example: main within the class

//Java program to illustrate how to define a class fields
//Defining a ObjectClass class

public class ObjectClass {
    //Defining fields
    int id; //Field or Data Member or Instance variable

    String name;

    //Creating main method inside the ObjectClass
    public static void main(String[] args) {

        //Creating an object or instance
        ObjectClass oc = new ObjectClass(); //Creating an object of ObjectClass

        //Printing values of the object
        System.out.println(oc.id); //Accessing member through reference variable
        System.out.println(oc.name);

    }
}


//Object and Class Example: main outside the class

// Java Program to demonstrate having the main method in
// another class
// Creating Student class.
// class Student{
//
//    int id;
//    String name;
//}
//
// Creating another class TestStudent1 which contains the main method
//class TestStudent1{
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//    }
//}



// What is a class in Java?
// A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
//
//        A class in Java can contain:
//
//        a) Fields
//        b) Methods
//        c) Constructors
//        d) Blocks
//        e) Nested class and interface
//Syntax to declare a class:
//
//        class <class_name>{
//              field;
//              method();
//        }

//new keyword in Java
//
//        The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.
