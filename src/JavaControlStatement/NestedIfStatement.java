package JavaControlStatement;

public class NestedIfStatement {
    public static void main(String[] args) {

        String address = "Delhi, India";

        //First condition
        if(address.endsWith("India")){

            //First Nested Condition
            if(address.contains("Meerut")) {

                //Executes when first nested condition is true
                System.out.println("Your city is Meerut");

                //Second Nested Condition
            }else if(address.contains("Noida")){

                //Executes when second nested condition is true
                System.out.println("Your city is Noida");
            }else{

                //Executes when no nested condition is true
                System.out.println(address.split(",")[0]);
            }
        }else{

            //Executes when first condition is false
            System.out.println("You are not in India");
        }
    }
}

