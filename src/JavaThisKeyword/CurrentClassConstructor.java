package JavaThisKeyword;

// 3) this() : to invoke current class constructor
//
// The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
//
// Calling default constructor from parameterized constructor:

class B{

    B(){
        System.out.println("Hello B");
    }

    B(int x){
        this(); // Same as B() method
        System.out.println(x);
    }

}
public class CurrentClassConstructor {

    public static void main(String[] args) {

        B b = new B(10);
    }
}

// Calling parameterized constructor from default constructor:
//    class A{
//      A(){
//      this(5);
//      System.out.println("hello a");
//      }
//      A(int x){
//      System.out.println(x);
//      }
//   }
//   class TestThis6{
//    public static void main(String args[]){
//    A a=new A();
//   }}

// Real usage of this() constructor call
//
// The this() constructor call should be used to reuse the constructor from the constructor.
// It maintains the chain between the constructors i.e. it is used for constructor chaining.
// Let's see the example given below that displays the actual use of this keyword.
//
// class Student{
//   int rollno;
//   String name,course;
//   float fee;
//   Student(int rollno,String name,String course){
//   this.rollno = rollno;
//   this.name = name;
//   this.course = course;
//   }
//   Student(int rollno,String name,String course,float fee){
//   this(rollno,name,course); // Reusing constructor
//   this.fee = fee;
//   }
//   void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
//   }
//   class TestThis7{
//   public static void main(String args[]){
//   Student s1=new Student(111,"ankit","java");
//   Student s2=new Student(112,"sumit","java",6000f);
//   s1.display();
//   s2.display();
// }}
//
// Rule: Call to this() must be the first statement in constructor. Otherwise, there will be a
// Compile Time Error: Call to this must be first statement in constructor
