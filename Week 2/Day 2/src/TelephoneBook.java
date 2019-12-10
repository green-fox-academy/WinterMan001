import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[]Args){

        HashMap<String, String> telbook = new HashMap<String, String>();
        telbook.put("William A.Lathan,", "405-709-1865");
        telbook.put("John K. Miller", "402-247-8568");
        telbook.put("Hortensia E. Foster", "606-481-6467");
        telbook.put("Amanda D. Newland", "319-243-5613");
        telbook.put("Brooke P. Askew", "307-687-2982");
        System.out.println(telbook);

        String i = telbook.get("John K. Miller");
            System.out.println(i);


        String o = telbook.get("307-687-2982");
        System.out.println(o);


    }
}
