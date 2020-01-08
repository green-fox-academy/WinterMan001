package animal;

public abstract class Animal {
    String name;
    int age;

    public Animal() {
    }


    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public abstract String breed();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    void printName() {
        System.out.println("Animal's name is " + this.name);
    }
}
