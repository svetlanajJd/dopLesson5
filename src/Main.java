import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 5.массивы");
        int[][] matrix = new int[3][3];
        for (int[] row : matrix) {
            matrix[0][0] = 1;
            matrix[0][2] = 1;
            matrix[1][1] = 1;
            matrix[2][0] = 1;
            matrix[2][2] = 1;
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 6.массивы");
        int[] array = {5, 4, 3, 2, 1};
        int[] arrayNew = new int[5];
        System.arraycopy(array, 0, arrayNew, 0, 5);
        for (int i = arrayNew.length - 1; i >= 0; i--) {
            arrayNew[i] = i + 1;
        }
        System.out.println("Массив до преобразования- " + Arrays.toString(array));
        System.out.println("Массив после преобразования- " + Arrays.toString(arrayNew));

        System.out.println("Задание 7.массивы");
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = i + 1;
        }
        System.out.println("Массив после преобразования- " + Arrays.toString(array));

        System.out.println("Задание 9.массивы");
        int[] arraySum = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        Arrays.sort(arraySum);
        for (int i = 0; i < arraySum.length - 1; i++) {
            for (int j = i + 1; j < arraySum.length; j++) {
                if (arraySum[i] + arraySum[j] == -2) {
                    int res = Arrays.binarySearch(arraySum, arraySum[i]);
                    int res1 = Arrays.binarySearch(arraySum, arraySum[j]);
                    System.out.println(arraySum[res] + " " + arraySum[res1]);
                }
            }
        }

    }

}

