package JavaControlStatement;

public class IfElseIfLadderStatement {
    public static void main(String[] args) {

        String city = "Delhi";

        //First condition
        if(city=="Meerut"){

            //Executes when first condition is true
            System.out.println("City is Meerut");

        //Second condition
        }else if(city=="Noida"){

            //Executes when second condition is true
            System.out.println("City is Noida");

        //Third condition
        }else if(city=="Agra"){

            //Executes when second condition is true
            System.out.println("City is Agra");
        }else{

            //Executes when no condition is true
            System.out.println(city);
        }
    }
}