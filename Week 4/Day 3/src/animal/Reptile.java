package animal;

public class Reptile extends Animal {

    public Reptile(String name, Integer age) {
       super(name, age);
    }

    public Reptile(String name) {

    }

    public String breed(){
        String breed = "From eggs.";
        return breed;
    }

}

