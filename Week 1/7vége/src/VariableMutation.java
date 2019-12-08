public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10

        System.out.println(a + 10);

        int b = 100;
        // make b smaller by 7

        System.out.println(b-7);

        int c = 44;
        // please double c's value

        System.out.println(c*2);

        int d = 125;
        // please divide by 5 d's value

        System.out.println(d/5);

        int e = 8;
        // please cube of e's value

        System.out.println(e^2);

        int f1 = 123;
        int f2 = 345;

        if (f1>f2) {
            boolean itsbigger = false;
            System.out.println(itsbigger);
        } else {
            boolean itsnotbigger = true;
            System.out.println(itsnotbigger);
        }

        int g1 = 350;
        int g2 = 200;

        if (g2*2>g1) {
            boolean itis = true;
            System.out.println(itis);
        }else if (g2*2<g1) {
            boolean itsnot = false;
            System.out.println(itsnot);
        }
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        if (h%11 == 0) {
            boolean its = true;
            System.out.println(its);
        } else {
            boolean ist = false;
            System.out.println(ist);
        }

        int i1 = 10;
        int i2 = 3;
        int i2s = i2^2;
        if (i1>i2s){
            boolean itshigher = true;
            System.out.println(itshigher);
        } else {
            boolean itslower = false;
            System.out.println(itslower);
        }

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        if (j%5 == 0 && j%3 == 0) {
            boolean itstrue = true;
            System.out.println(itstrue);
        } else {
            System.out.println("false");
        }

        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}