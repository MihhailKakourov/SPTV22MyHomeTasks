package tasks;
import java.util.Random;
public class ArrayDemo {
    public void doCreateArray() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(100)*2;
            array[i] = randomNumber;
        }

        System.out.println("Случайные четные числа:");
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < 20; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i] != min && array[i] != max) {
                sum += array[i];
            }
        }
        double average = (double) sum / 18;
        System.out.println("Среднее арифметическое: " + average);
    }
}