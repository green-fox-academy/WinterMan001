class Vehicle{
    String size;
    String color;
    int age = 200;

    public int yearsLeft(){
        int Left = 100 - age;
        return Left;
    }
    public int getAge(){
        return age;
    }
}

public class GetSet{
    public static void main(String[]Args){
        Vehicle plane = new Vehicle();
        plane.age = 34;
        plane.color = "Green";




        System.out.println(plane.yearsLeft());
        int age = plane.getAge();
        System.out.println();

    }


}