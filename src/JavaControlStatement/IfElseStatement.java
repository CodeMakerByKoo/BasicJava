package JavaControlStatement;

public class IfElseStatement {
    public static void main(String[] args) {

        int x = 10;
        int y = 12;

        //Boolean expression, either True or False
        if(x+y < 20){

            //Executes when condition is true
            System.out.println("x + y is less than 20");
        }else{

            //Executes when condition is false
            System.out.println("x + y is greater than 20");
        }
    }
}