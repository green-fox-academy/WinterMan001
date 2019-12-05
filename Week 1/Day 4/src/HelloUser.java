import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name!");
        String UserInput1 = scan.nextLine();
        System.out.println("Name is: " + UserInput1);
        scan.close();
    }
}