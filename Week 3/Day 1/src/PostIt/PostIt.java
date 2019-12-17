package PostIt;



public class PostIt {
    String backgroundcolor;
    String textOnIt;
    String textColor;

    public String asd() {
        return "Post it has: a backgroundcolor: " + backgroundcolor + "text on it: " + textOnIt + "text color: " + textColor;
    }
    public PostIt (String backgroundcolor, String textOnIt, String textColor ){
        this.backgroundcolor = backgroundcolor;
        this.textOnIt = textOnIt;
        this.textColor = textColor;

    }
}

