import java.util.HashMap;


public class MapIntroduction1 {
    public static void main(String[]Args){
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        map.put(97,'a');
        map.put(98,'v');
        map.put(99,'c');
        map.put(65,'A');
        map.put(66,'B');
        map.put(67,'C');
            System.out.println(map);

        map.put(68, 'D');
            System.out.println(map.size());

        map.remove(97,'a');
            System.out.println(map);


        System.out.println(map.containsValue(97));

    }

}
