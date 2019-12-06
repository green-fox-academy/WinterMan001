import java.util.Scanner;

public class AverageInput {
    public static void main(String[] args) {
        System.out.println("Tell me 5 integers: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i <4 ; i++) {
            a += scan.nextInt();
        }
        scan.close();
       // System.out.println("Your numbers added up are: " + ( a + b + c + d + e));
        System.out.println("Your numbers added up are: " + a);
       //4 int f = a + b + c + d + e;
        System.out.println("The average of your numbers are: " + (a/5 ));


    }
}
