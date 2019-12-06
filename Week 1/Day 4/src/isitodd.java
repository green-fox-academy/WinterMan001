import java.util.Scanner;

public class isitodd {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (1 % 2 ==0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }

    }
}
