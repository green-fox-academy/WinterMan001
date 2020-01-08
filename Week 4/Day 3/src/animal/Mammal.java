package animal;

public class Mammal extends Animal {

    //public Mammal() {
    //    super(name, age);
    //}

    public Mammal(String name, int age) {
        super(name, age);
        }

    public Mammal(String name) {
        super();
    }

    public Mammal() {
        super();
    }

    @Override
    public String breed() {
        return "by making small selfs";
    }

}
