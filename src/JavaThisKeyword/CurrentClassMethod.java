package JavaThisKeyword;

// 2) this: to invoke current class method
//
// You may invoke the method of the current class by using the this keyword.
// If you don't use the this keyword, compiler automatically adds this keyword
// while invoking the method.

class A{

    void m(){

        System.out.println("Print m");
    }

    void n(){

        System.out.println("Print n");
        this.m(); // m(); is same as this.m()
    }
}

public class CurrentClassMethod {

    public static void main(String[] args) {

        A a1 = new A();
        a1.n();
    }
}
