package tasks;

import java.util.Scanner;

public class TensAndOnes {

    public static void main(String[] args) {
        TensAndOnes tensAndOnes = new TensAndOnes();
        tensAndOnes.conversation();
    }

    public void conversation() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println("Выберите опцию:");
            System.out.println("0. Выход");
            System.out.println("1. Парсер трехзначного числа");
            System.out.print("Введите номер опции: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    parse();
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Неверный номер опции. Попробуйте снова.");
                    break;
            }
        } while (repeat);
    }

    public void parse() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.print("Введите трехзначное число: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num < 100 || num > 999) {
                System.out.println("Число не является трехзначным, введите трехзначное число!");
            } else {
                int hundreds = num / 100;
                int tens = (num % 100) / 10;
                int ones = num % 10;
                int total = hundreds + tens + ones;

                System.out.println("Количество десятков: " + tens);
                System.out.println("Количество единиц: " + ones);
                System.out.println("Сумма чисел равна: " + total);
                System.out.println("--------------------");

                repeat = false;
            }
        } while (repeat);
    }
}