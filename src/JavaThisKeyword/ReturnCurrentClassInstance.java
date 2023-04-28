package JavaThisKeyword;

// 6) this keyword can be used to return current class instance
//
// We can return this keyword as an statement from the method.
// In such case, return type of the method must be the class type (non-primitive).
// Let's see the example:

class C{

    C  getC(){

        return this;
    }

    void msg(){

        System.out.println("Hello Java");
    }
}
public class ReturnCurrentClassInstance {

    public static void main(String[] args) {

        new C().getC().msg();
    }
}

// Proving this keyword
//
// Let's prove that this keyword refers to the current class instance variable.
// In this program, we are printing the reference variable and this,
// output of both variables are same.
//
// class A5{
//  void m(){
//   System.out.println(this);//prints same reference ID
//  }
// public static void main(String args[]){
//  A5 obj=new A5();
//   System.out.println(obj);//prints the reference ID
//   obj.m();
//  }
// }
//
// Output: A5@22b3ea59
//         A5@22b3ea59
