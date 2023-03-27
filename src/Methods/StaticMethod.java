package Methods;

//Static Method

// 1) A method that has static keyword is known as static method.
//    In other words, a method that belongs to a class rather than
//    an instance of a class is known as a static method. We can
//    also create a static method by using the keyword static before
//    the method name.
// 2) The main advantage of a static method is that we can call it
//    without creating an object.
// 3) The best example of a static method is the main() method.

public class StaticMethod {

    public static void main(String[] args) {

        show();
    }

    static void show(){

        System.out.println("It is an example of static method");
    }
}
