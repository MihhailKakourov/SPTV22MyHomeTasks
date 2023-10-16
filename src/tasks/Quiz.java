package tasks;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            int correctResult = num1 * num2;

            System.out.print("Вопрос номер " + (i + 1) + ": Сколько будет " + num1 + " * " + num2 + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctResult) {
                System.out.println(ANSI_GREEN + "Верно!" + ANSI_RESET);
                correctAnswers++;
            } else {
                System.out.println(ANSI_RED + "Неверно!" + ANSI_RESET);
            }
        }

        System.out.println("Тест завершен. Ваш результат: " + correctAnswers + " из 5.");

        if (correctAnswers == 5) {
            System.out.println("Молодец!");
        } else if (correctAnswers >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения.");
        }
    }
}
