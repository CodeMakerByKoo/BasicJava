package Methods;

// Accessor Method:
//
// The method(s) that reads the instance variable(s) is known as
// the accessor method. We can easily identify it because the method is prefixed
// with the word get. It is also known as getters. It returns the value of the
// private field. It is used to get the value of the private field.

// Mutator Method:
//
// The method(s) read the instance variable(s) and also modify the values.
// We can easily identify it because the method is prefixed with the word set.
// It is also known as setters or modifiers. It does not return anything.
// It accepts a parameter of the same data type that depends on the field.
// It is used to set the value of the private field.

import java.util.Scanner;

public class AccessorAndMutatorMethod {

    public static int roll;
    public static String name;

    public int getRoll()    // Accessor method
    {
        return roll;
    }

    public void setRoll(int roll) // Mutator method
    {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }

    public static void main(String[] args) {

        AccessorAndMutatorMethod obj = new AccessorAndMutatorMethod(); // Creating a class object
        Scanner scan1 = new Scanner(System.in); // Calling Scanner class
        System.out.println("Please enter the Roll no: ");
        roll = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter the Student Name: ");
        name = scan2.next();

        obj.display();
    }
}
