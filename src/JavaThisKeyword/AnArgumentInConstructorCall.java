package JavaThisKeyword;

// 5) this: to pass as argument in the constructor call
//
// We can pass the this keyword in the constructor also.
// It is useful if we have to use one object in multiple classes.
// Let's see the example:

class D{

    AnArgumentInConstructorCall obj;

    D(AnArgumentInConstructorCall obj){

        this.obj = obj;
    }

    void display(){

        System.out.println(obj.data); // Using data member of AnArgumentInConstructorCall class
    }
}

public class AnArgumentInConstructorCall {

    int data = 10;

    AnArgumentInConstructorCall(){

        D d = new D(this);
        d.display();
    }

    public static void main(String[] args) {

        AnArgumentInConstructorCall d = new AnArgumentInConstructorCall();
    }
}
