import java.util.Scanner;

public class DivideByZero {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int divide = 10;

        int tester = 0;
        do {
            System.out.println("Give me a number! ");
            int input = scan.nextInt();
            try {
                System.out.println(input + " Divided by : " + divide + " equals = " + divide / input);
                tester++;
            } catch (ArithmeticException e) {
                System.out.println("Fail.");
            }
        } while (tester < 1);


    }
}