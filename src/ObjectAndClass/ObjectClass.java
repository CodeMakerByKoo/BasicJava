package ObjectAndClass;
//Java program to illustrate how to define a class fields
//Defining a ObjectClass class
public class ObjectClass {
    //Defining fields
    int id; //Field or Data Member or Instance variable

    String name;
    //Creating main method inside the ObjectClass
    public static void main(String[] args) {
        //Creating an object or instance
        ObjectClass oc = new ObjectClass(); //Creating an object of ObjectClass
        //Printing values of the object
        System.out.println(oc.id); //Accessing member through reference variable
        System.out.println(oc.name);

    }
}
