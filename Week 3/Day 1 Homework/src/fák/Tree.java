package fák;

public class Tree {
    private String törzs;
    private String leafColor;
    private int age;
    private String sex;

    public Tree() {
        törzs = "b";
        leafColor = "sz";
        age = 22;
        sex = "f";
    }

    public Tree(String törzs, String leafColor, int age, String sex) {
        this.törzs = törzs;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    public String getTörzs() {
        return törzs;
    }

    public void setTörzs(String törzs) {
        this.törzs = törzs;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
