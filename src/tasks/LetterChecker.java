package tasks;

import java.util.Scanner;

public class LetterChecker {

    public static void checkAlphabet() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String text = userInput.toLowerCase();

        char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

        boolean allLetters = true;

        for (char letter : alphabet) {
            if (text.indexOf(letter) == -1) {
                allLetters = false;
                break;
            }
        }

        if (allLetters) {
            System.out.println("Все буквы алфавита есть в тексте.");
        } else {
            System.out.println("Не все буквы алфавита есть в тексте.");
        }
    }
}