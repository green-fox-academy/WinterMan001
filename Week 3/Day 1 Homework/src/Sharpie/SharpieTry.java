package Sharpie;

public class SharpieTry {
    public static void main(String[]Args){

        Sharpie sharp = new Sharpie();
        sharp.setColor("Green");

        System.out.println(sharp.getColor());
        sharp.use();
        System.out.println(sharp.getinkAmount());

    }
}
