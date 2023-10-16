package sorts;
import java.util.Arrays;
import java.util.Random;
public class ArraySort {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array1[i] = random.nextInt(19-0 + 1) + 0;
        }
        System.out.println("no sort:\n" + Arrays.toString(array1));
//        Arrays.sort(array1);
//        System.out.println("sort:" + Arrays.toString(array1));
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int swap = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = swap;
                }
            }
        }
//        System.out.println("sort:" + Arrays.toString(array1));
        System.out.println("sort:");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("%-4d" , array1[i]);
        }

        int[][] matrix = new int[100][100];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(19 - 0 + 1) + 0;
            }
        }
        System.out.println();
        System.out.println("no sort:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.printf("%-4d" , matrix[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i].length; k++) {
                    for (int n = 0; n < matrix.length; n++) {
                        if (matrix[i][j] < matrix[k][n]) {
                            matrix[i][j] = matrix[i][j] + matrix[k][n];
                            matrix[k][n] = matrix[i][j] - matrix[k][n];
                            matrix[i][j] = matrix[i][j] - matrix[k][n];

                        }
                    };
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


