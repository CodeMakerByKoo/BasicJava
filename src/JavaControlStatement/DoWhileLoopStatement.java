package JavaControlStatement;

public class DoWhileLoopStatement {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("Printing the  numbers of first 10 even numbers \n");

        //To execute the loop at least once when the number of iteration is not known
        do{
            System.out.println(i);
            i = i + 2;
        }while(i<=10);
    }
}
