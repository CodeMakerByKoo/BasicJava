package StaticKeyword;

// Program of counter by static variable
//
// As we have mentioned above, static variable will get the memory only once,
// if any object changes the value of the static variable, it will retain its value.

// Java Program to illustrate the use of static variable which
// is shared with all objects.

class Counter2{

    static int count; // Will get memory only once and retain its value

    Counter2(){

        count++; // Incrementing the value of static variable
        System.out.println(count);
    }
}
public class DifferenceWithStatic {

    public static void main(String[] args) {

        // Creating objects
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}
