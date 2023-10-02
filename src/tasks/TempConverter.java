package tasks;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        TempConverter converter = new TempConverter();
        converter.convert();
    }

    public void convert() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println("Выберите опцию:");
            System.out.println("0. Выход");
            System.out.println("1. Перевести из Цельсия в Фаренгейты");
            System.out.println("2. Перевести из Фаренгейтов в Цельсии");
            System.out.print("Введите номер опции: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
                    celsiusToFahrenheit.convert();
                    break;
                case 2:
                    FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
                    fahrenheitToCelsius.convert();
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Неверный номер опции. Попробуйте снова.");
                    break;
            }

            if (repeat) {
                System.out.print("Хотите продолжить? (y/n): ");
                String response = scanner.next();
                repeat = response.equalsIgnoreCase("y");
            }

        } while (repeat);
    }
}

class CelsiusToFahrenheit{
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
    }
}

class FahrenheitToCelsius{
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Фаренгейта:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Температура в градусах Цельсия: " + celsius);
    }
}