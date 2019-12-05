import java.util.Scanner;

import static java.lang.System.out;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        System.out.println("Give me the miles you wanna convert... ");
        Scanner Scan = new Scanner(System.in);
        String UserInput = Scan.nextLine();

        double miles = Double.parseDouble(UserInput);
        double km =  (miles * 1.609344);
        System.out.println("That is.. " + km);
        System.out.println("cool..");



        // then it converts that value to kilometers and prints it
    }


}
