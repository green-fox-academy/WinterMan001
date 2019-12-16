import java.util.HashMap;
import java.util.Scanner;

public class Score {
    public static void main(String[] Args) {

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Jack", 44);
        scores.put("John", 33);
        scores.put("Xpro22TTV", 64);
        scores.put("beginnerguy", 4);
        scores.put("soccerSkin", 1);
        scores.put("TwitchAimPro", 42);
        scores.put("MegaNoob", 233);


        System.out.println("Which of the following player's score would you like to check? " + "\n" + scores.keySet());
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        searchPlayer(playerName, scores);
    }

    public static void searchPlayer(String playerName, HashMap<String, Integer> map) {
        while (!map.containsKey(playerName)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("No such player, please use the list: " + "\n" + map.keySet());
                playerName =scanner.nextLine();
            }
        System.out.println(map.get(playerName));
        }


    }




