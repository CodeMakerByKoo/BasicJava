package Methods;

// Instance Method
//
// The method of the class is known as an instance method.
// It is a non-static method defined in the class.
// Before calling or invoking the instance method,
// it is necessary to create an object of its class.
// Let's see an example of an instance method.

public class InstanceMethod {

    public static void main(String[] args) {

        InstanceMethod obj = new InstanceMethod(); // Creating an object of the class

        System.out.println("The sum is " + obj.add(12, 13)); // Invoking instance method
    }

    int s;

    public int add(int a, int b){ // User-defined method because we have not used static keyword

        s = a + b;

        return s; //returning the sum
    }
}
