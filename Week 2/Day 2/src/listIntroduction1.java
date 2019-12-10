import java.util.ArrayList;

public class listIntroduction1 {
    public static void main (String[]Args){
        ArrayList<String> friends = new ArrayList<String>();
            System.out.println(friends);
        friends.add("William");
            System.out.println(friends);
        friends.add("John");
        friends.add("Amanda");
        System.out.println(friends);
        System.out.println(friends.size());
    }
}
