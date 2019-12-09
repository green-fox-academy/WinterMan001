public class Pyramid {
    public static void main(String[] Args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("a");

            }
            System.out.println();
        }
    }
}