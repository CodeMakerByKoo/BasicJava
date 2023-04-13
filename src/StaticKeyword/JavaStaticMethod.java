package StaticKeyword;

// Java static method
//
// If you apply static keyword with any method, it is known as static method.
//
// 1) A static method belongs to the class rather than the object of a class.
// 2) A static method can be invoked without the need for creating an instance of a class.
// 3) A static method can access static data member and can change the value of it.

class NewStudent{ // Java Program to demonstrate the use of a static method.

    int rollno;
    String name;
    static String college = "ITS";

    static void change(){ // Static method to change the value of static variable

        college = "BBDIT";
    }

    NewStudent(int r, String n){ // Constructor to initialize the variable
         rollno = r;
         name = n;
    }

    void display(){ // Method to display values

        System.out.println(rollno + " " + name + " " + college);
    }
}
public class JavaStaticMethod { // Test class to create and display the values of object

    public static void main(String[] args) {

        NewStudent.change(); // Calling change static method

        // Creating objects
        NewStudent s1 = new NewStudent(111, "test1");
        NewStudent s2 = new NewStudent(222, "test2");
        NewStudent s3 = new NewStudent(333, "test3");

        // Calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}

// Another example of a static method that performs a normal calculation

//   //Java Program to get the cube of a given number using the static method
//
//  class Calculate{
//
//    static int cube(int x){
//
//    return x*x*x;
//
//    }
//
//    public static void main(String args[]){
//
//    int result = Calculate.cube(5);
//
//    System.out.println(result);
//
//    }
//
//  }

// Restrictions for the static method
//
// There are two main restrictions for the static method. They are:
//
// 1) The static method can not use non static data member or call non-static method directly.
// 2) this and super cannot be used in static context.

// class A{
//
//  int a = 40; // Non-static
//
//  public static void main(String args[]){
//
//   System.out.println(a);
//
//  }
//
// }
// Output:Compile Time Error
//
// Q) Why is the Java main method static?
//
// Ans) It is because the object is not required to call a static method.
//      If it were a non-static method, JVM creates an object first then call main()
//      method that will lead the problem of extra memory allocation.
