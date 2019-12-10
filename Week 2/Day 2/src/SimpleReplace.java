public class SimpleReplace {
    public static void main(String... args){

        String message = "In a dishwasher far far away";
        String name = "galaxy";
        String result = message.replaceAll("dishwasher", name);
        System.out.println(result);


    }
}