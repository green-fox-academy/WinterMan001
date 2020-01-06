import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetIndex {
    public static void main(String[] Args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 256));
        System.out.println("Give me a number.. so i can check the list... (make it between 0-10)");
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        lister(input1, numbers);
        if (numbers.contains(input1) == false) {
            System.out.println("Does not contain.");
        }

    }

    public static Integer lister(int input1, ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == input1) {
                System.out.println("Contains it! Associated key: " + numbers.get(i));

            }
        }

        return input1;
    }
}

