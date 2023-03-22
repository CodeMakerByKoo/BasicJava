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

// 2)Object and Class Example: Initialization through method

//class Student{
//
//    int rollno;
//    String name;
//
//    void insertRecord(int r, String n){
//
//        rollno = r;
//        name = n;
//    }
//
//    void displayInformation(){
//
//        System.out.println(rollno + " " + name);
//    }
//}
//
//class TestStudent4{
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student(); //s1 and s2 both are reference variables that refer to the objects allocated in memory
//        Student s2 = new Student(); // s1 and s2 are in stack memory
//
//        s1.insertRecord(111, "Karan"); //111,"Karan" is in heap memory
//        s2.insertRecord(222, "Aryan");
//
//        s1.displayInformation();
//        s2.displayInformation();
//    }
//}

// 3)Object and Class Example: Initialization through constructor

//class Employee{
//
//    int id;
//    String name;
//    float Salary;
//
//    void insert(int i, String n, float s){
//
//        id = i;
//        name = n;
//        salary = s;
//    }
//
//    void display(){
//
//        System.out.println(id + " " + name + " " + salary);
//    }
//}
//
//class TestEmployee{
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Employee();
//        Employee e2 = new Employee();
//        Employee e3 = new Employee();
//
//        e1.insert(101, "ajeet", 45000);
//        e2.insert(102, "irfan", 25000);
//        e3.insert(103, "nakul", 55000);
//
//        e1.display();
//        e2.display();
//        e3.display();
//    }
//}
