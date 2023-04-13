package StaticKeyword;

// Java Static Block
//
// 1) Is used to initialize the static data member.
// 2) It is executed before the main method at the time of classloading.

public class JavaStaticBlock {

    static{
        System.out.println("Static Block is invoked");
    }

    public static void main(String[] args) {

        System.out.println("Hello Main");
    }
}

// Q) Can we execute a program without main() method?
//
// Ans) No, one of the ways was the static block, but it was possible till JDK 1.6.
//      Since JDK 1.7, it is not possible to execute a Java class without the main method.
