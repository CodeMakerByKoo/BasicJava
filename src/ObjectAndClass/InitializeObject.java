package ObjectAndClass;

// There are 3 ways to initialize object in Java.
//
//        By reference variable
//        By method
//        By constructor

// 1) Object and Class Example: Initialization through reference
class Student {

    int id;
    String name;

}
class TestStudent2{

    public static void main(String[] args) {

        //Creating an object
        Student s1 = new Student();
        //Initializing objects
        s1.id=101;
        s1.name="Sonoo";

        System.out.println(s1.id + " " + s1.name); //Printing members with a white space
    }
}

// 2)Object and Class Example: Initialization through reference

