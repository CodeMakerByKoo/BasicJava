package JavaControlStatement;

public class ForLoopStatement {

    public static void main(String[] args) {

        int sum = 0;

        for(int j = 1; j<=10; j++){

            sum = sum + j;
        }

        System.out.println("The sum of first ten natural numbers is "+ sum);
    }
}
