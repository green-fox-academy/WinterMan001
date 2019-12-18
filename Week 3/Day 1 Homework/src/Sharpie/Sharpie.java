package Sharpie;

public class Sharpie {
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie()

    {
        color = "Zöld;";
        width = 0;
        inkAmount = 100f;
    }

    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public float getinkAmount(){
        return inkAmount;

    }
    public void setInkAmount(float inkAmount){
        this.inkAmount = inkAmount;
    }

    public void use(){
        inkAmount--;
    }

}
