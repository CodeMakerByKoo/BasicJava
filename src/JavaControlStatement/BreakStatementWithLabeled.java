package JavaControlStatement;

public class BreakStatementWithLabeled {

    public static void main(String[] args) {

        a:
        for(int i=0;i<=10;i++){

            b:
            for(int j=0;j<=15;j++){

                c:
                for(int k=0;k<=20;k++){

                    System.out.println(k);

                    if(k==5){
                        //To skip the part of the loop "a" when k is equal to 5
                        break a;
                    }
                }
            }
        }
    }
}
