public class Matrix {
    public static void main(String[] Args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[1][0] = 0;
                }
            }

        }
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.println(element + " ");

            }
            System.out.println();

        }
    }
}