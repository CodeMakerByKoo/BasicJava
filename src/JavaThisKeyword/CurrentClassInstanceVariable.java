package JavaThisKeyword;

// 1) this: to refer current class instance variable
//
// The this keyword can be used to refer current class instance variable.
// If there is ambiguity between the instance variables and parameters,
// this keyword resolves the problem of ambiguity.

// Understanding the problem without this keyword
//
// Let's understand the problem if we don't use this keyword by the example given below:
//
//  class Student{
//
//    int rollno;
//    String name;
//    float fee;
//
//    Student(int rollno,String name,float fee){
//      rollno = rollno;
//      name = name;
//      fee = fee;
//    }
//
//    void display(){System.out.println(rollno+" "+name+" "+fee);}
//    }
//
//    class TestThis1{
//    public static void main(String args[]){
//
//    Student s1=new Student(111,"ankit",5000f);
//    Student s2=new Student(112,"sumit",6000f);
//    s1.display();
//    s2.display();
//
//    }
//  }
// Output:
// 0 null 0.0
// 0 null 0.0
//
// In the above example, parameters (formal arguments) and instance variables are same.
// So, we are using this keyword to distinguish local variable and instance variable.

class Student{

    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display(){

        System.out.println(rollno + " " + name + " " + fee);
    }
}
public class CurrentClassInstanceVariable {

    public static void main(String[] args) {

        Student s1 = new Student(111,"test1",1000f);
        Student s2 = new Student(222,"test2",2000f);

        s1.display();
        s2.display();
    }
}

// If local variables(formal arguments) and instance variables are different,
// there is no need to use this keyword

//   Java variables example
//
//  public class A
//  {
//      static int m=100;//static variable
//      void method()
//      {
//          int n=90;//local variable
//      }
//      public static void main(String args[])
//      {
//          int data=50;//instance variable
//      }
//  }//end of class
//
// Local variable: This is a variable that is declared inside the body of a method.
//
// Instance variable: This Java variable is defined without the STATIC keyword, but as outside of a method declaration. They are object-specific variables, which is why they are known by this name.
//
// Static variable: This variable is initialized only once, just when the program execution starts. It is the variable that should be initialized first, especially before an instance variable is initialized.
