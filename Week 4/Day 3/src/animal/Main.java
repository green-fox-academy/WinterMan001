package animal;

public class Main {
    public static void main(String[] args) {

        Reptile Reptile = new Reptile("Varanus",34);
        Mammal Mammal = new Mammal("Bear",45);
        Bird Bird = new Bird("Eagle", 34);

        System.out.println("How do you breed?");
        System.out.println("A " + Reptile.getName() + " is breeding by " + Reptile.breed());
        System.out.println("A " + Mammal.getName() + " is breeding by " + Mammal.breed());
        System.out.println("A " + Bird.getName() + " is breeding by " + Bird.breed());

            }
}
