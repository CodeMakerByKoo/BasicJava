package Methods;

// Abstract Method
//
// The method that does not has method body is known as abstract method.
// In other words, without an implementation is known as abstract method.
// It always declares in the abstract class.
// It means the class itself must be abstract if it has abstract method.
// To create an abstract method, we use the keyword abstract.

abstract class Demo //abstract class
{
    //abstract method declaration
    abstract void display();
}

public class AbstractMethod extends Demo {

    //method implementation
    void display() {
        System.out.println("Abstract method?");
    }

    public static void main(String args[]) {

        Demo obj = new AbstractMethod(); //Creating object of abstract class

        obj.display(); //Invoking abstract method
    }
}
