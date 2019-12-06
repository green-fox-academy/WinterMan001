import java.util.Scanner;

public class OneTwoAlot {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a <= 0){
            System.out.println("Not enought!");
        }else if (a == 1){

            System.out.println("Its one.");

        }else if (a == 2){

            System.out.println("Its two.");
        }else if (a > 2){

            System.out.println("A lot!");

        }

    }
}
