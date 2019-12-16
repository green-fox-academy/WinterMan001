import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        printMatrixContents(createIdentityMatrix(askForInput()));
    }

    // ask matrix size
    public static int askForInput() {
        System.out.println("Please enter the size of the matrix you wish to create");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // create identityMatrix

    public static int[][] createIdentityMatrix(int a) {
        int[][] m = new int[a][a];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (i == j) m[i][j] = 1;
        return m;
    }

    //print content
    public static void printMatrixContents(int[][] m) {
        for (int[] row : m) {
            for (int item : row) System.out.print(item + " ");
            System.out.println();
        }
    }
}