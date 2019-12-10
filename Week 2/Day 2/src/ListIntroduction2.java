import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[]Args){

        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> B = new ArrayList<String>();

        A.add("Avocado");
        A.add("Blueberries");
        A.add("Durian");
        A.add("Lychee");

        B.addAll(A);
        System.out.println(B);

        System.out.println(A.contains("Durian"));

        System.out.println(B.remove("Durian"));
        System.out.println(B);

        A.add(4,"Kiwifruit");
            System.out.println(A);

        int firstIndex = A.indexOf("Avocado");
        System.out.println(firstIndex);

        System.out.println(B);
        int secondIndex = B.indexOf("Durian");
        System.out.println(secondIndex);

        B.add("Pomelo and Passion fruit");

        System.out.println(A.get(3));




    }
}
