package JavaControlStatement;

public class BreakStatement {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){

            System.out.println(i);

            if(i==6){
                //To break the current flow of the program and
                //transfer the control to the next statement outside
                //a loop or switch statement
                break;
            }
        }
    }
}
