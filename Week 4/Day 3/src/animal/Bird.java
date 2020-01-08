package animal;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird(String Bird) {
        super();
    }

    //public Bird(String parrot) {
    //    super();
    //}

    public String breed(){
        String breed = "from an Egg";
        return breed;
    }
}

