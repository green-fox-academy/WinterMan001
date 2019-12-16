import javax.swing.*;
import java.util.Scanner;

public class minimum {
    public static void main(String[] Args) {

        System.out.println("Give me number 1.");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Give me number 2, and I will tell which number is the smaller: ");
        int num2 = scan.nextInt();
        int theMinimum = minFunction(num1,num2);
        System.out.println("The smaller number is : " + theMinimum);
    }

    public static int minFunction(int a, int b) {
        int min;
        if (a > b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }


}



