package JavaControlStatement;

public class ForEachLoopStatement {

    public static void main(String[] args) {

        String[] names = {"Java","C","C++","Python","Javascript"};

        System.out.println("Printing the content of the array names: \n");

        //To traverse the data structures like array or collection without updating the loop variable
        for(String name : names){

            System.out.println(name);
        }

    }
}
