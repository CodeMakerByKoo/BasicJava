package JavaControlStatement;

public class SwitchStatement {

    public static void main(String[] args) {

        int num = 2;

        switch(num){

            case 0:
                System.out.println("Number is 0");
            break;

            case 1:
                System.out.println("Number is 1");
            break;

            default:
                System.out.println(num);
        }
    }
}
//Points to be noted about switch statement:
//1) The case variables can be int, short, byte, char, or enumeration. String type is also supported since version 7 of Java
//2) Cases cannot be duplicate
//3) Default statement is executed when any of the case doesn't match the value of expression. It is optional.
//4) Break statement terminates the switch block when the condition is satisfied.
//5) It is optional, if not used, next case is executed.
//6) While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value.