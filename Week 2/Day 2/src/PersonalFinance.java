import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[]Args){
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);
        System.out.println(expenses);

        double sum = 0;
        for (double i : expenses)
            sum += i;
        System.out.println(sum);

        System.out.println(Collections.max(expenses));
        System.out.println(Collections.min(expenses));



            double average = sum / expenses.size();
            System.out.println("The average is : " + average);




    }
}
