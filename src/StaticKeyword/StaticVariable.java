package StaticKeyword;

// The static keyword in Java is used for memory management mainly.
// We can apply static keyword with variables, methods, blocks and nested classes.
// The static keyword belongs to the class than an instance of the class.

// The static can be:
//
// 1) Variable (also known as a class variable)
// 2) Method (also known as a class method)
// 3) Block
// 4) Nested class

// Java static variable

// If you declare any variable as static, it is known as a static variable.
//
// 1) The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
// 2) The static variable gets memory only once in the class area at the time of class loading.

// Advantages of static variable
//
// -> It makes your program memory efficient (i.e., it saves memory).

// Java Program to demonstrate the use of static variable
class Student{

    int rollno; // Instance variable
    String name;
    static String college = "ITS"; // Static variable

    Student(int o, String e){   //constructor

        rollno = o;
        name = e;
    }

    void display(){

        System.out.println(rollno + " " + name + " " + college);  //method to display the values
    }
}

public class StaticVariable { //Test class to show the values of objects

    public static void main(String[] args) {

        Student s1 = new Student(111, "Test1");
        Student s2 = new Student(222, "Test2");

        // We can change the college of all objects by the single line of code
        // Student.college= "BBDIT";

        s1.display();
        s2.display();
    }
}

// Suppose there are 500 students in my college, now all instance data members will get
// memory each time when the object is created. All students have its unique rollno and name,
// so instance data member is good in such case. Here, "college" refers to the common property
// of all objects. If we make it static, this field will get the memory only once.
