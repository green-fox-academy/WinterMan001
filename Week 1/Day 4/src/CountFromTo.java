import java.util.Scanner;

public class CountFromTo {
    public static void main(String[]args){

        System.out.println("Give me two numbers: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if (a < b){
            System.out.println("It is not bigger.");
        }if (a > b){
            for (int x=b; x < a; x++){
                System.out.println("adding up.. 1 by 1 " + x);
            }
        }
    }
}
