package Constructors;

// Copying values without constructor

// 1) We can copy the values of one object into another by assigning
//    the objects values to another object without creating constructor

public class CopyValueWithoutConstructor {

    int id;
    String name;

    CopyValueWithoutConstructor(int i, String n){

        id = i;
        name = n;
    }

    CopyValueWithoutConstructor(){}

    void display(){

        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        CopyValueWithoutConstructor wc1 = new CopyValueWithoutConstructor(1, "test");
        CopyValueWithoutConstructor wc2 = new CopyValueWithoutConstructor();

        wc2.id = wc1.id;
        wc2.name = wc1.name;

        wc1.display();
        wc1.display();

    }
}
