import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("\nSize of the matrix = 3\n");
        int size = 5;

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * (9 + 1));
            }
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
                count++;
                if (count == size) {
                    System.out.print("\n");
                    count = 0;

                }
            }
        }

        System.out.print("\nMain Diagonal = ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        int greaterThan5 = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > 5) {
                    greaterThan5++;
                }
            }
        }

        System.out.println("\nNumbers greater than 5 = " + greaterThan5);

    }
}
