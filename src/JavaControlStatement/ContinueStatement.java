package JavaControlStatement;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i=0;i<=2;i++){

            for(int j=i;j<=5;j++){

                if(j==4){
                    //To skip the specific part of the loop and
                    //jumps to the next iteration of the loop immediately
                    //by skipping number "4" and jumping to the next iteration of number "5"
                    continue;
                }

                System.out.println(j);
            }
        }
    }
}
