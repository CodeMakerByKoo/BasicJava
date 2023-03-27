package Methods;

import java.util.Scanner;

// User-Defined Method

// The method written by the user or programmer is known as a user-defined method.
public class UserDefinedMethod {

    public static void findEvenOdd(int num){ // User-defined method

        // Method body
        if(num%2==0){

            System.out.println(num + " is even");
        }else{

            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {

        // Creating Scanner class object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        // Reading value from the user
        int num = scan.nextInt();
        // Method calling
        findEvenOdd(num);
    }
}

// How to Call or Invoke a User-defined Method
//
// Once we have defined a method, it should be called.
// The calling of a method in a program is simple.
// When we call or invoke a user-defined method,
// the program control transfer to the called method.

// In the above code snippet, as soon as the compiler reaches at line findEvenOdd(num),
// the control transfer to the method and gives the output accordingly.
