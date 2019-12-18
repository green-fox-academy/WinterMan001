public class sportolok{
    public static void main(String[]Args){

        sportolók Katinka = new sportolók();
        Katinka.speed = 10;
        Katinka.strength = 1;
        Katinka.stamina = 2;

        sportolók József = new sportolók();
        József.speed = 20;
        József.strength = 23;
        József.stamina = 43;


        if (József.speed > Katinka.speed){

            System.out.println("József is faster.. with a speed of:" + Katinka.speed);


        }else{

            System.out.println("Katinka is faster.. with a speed of: " + József.speed);

        }



    }

}


class sportolók{

    int speed;
    int strength;
    int stamina;


}

