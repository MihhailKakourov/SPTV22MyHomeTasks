import tasks.CreateBooksArray;
import tasks.TempConverter;
import tasks.TensAndOnes;

import java.util.Scanner;

public class MyHomeTasks {
    private Scanner scanner;

    public MyHomeTasks(){
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Выберите задачу: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Десятки и единицы");
            System.out.println("3. Создание массива из 5 книг");

            int task = scanner.nextInt();
            scanner.nextLine();

            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;

                case 1:
                    System.out.println("Выбран конвертер температуры");
                    TempConverter tempConverter = new TempConverter();
                    tempConverter.convert();
                    break;
                case 2:
                    System.out.println("Выбран десятки и единицы");
                    TensAndOnes tensAndOnes = new TensAndOnes();
                    tensAndOnes.parse();
                    break;
                case 3:
                    System.out.println("Выбран создание массива из 5 книг");
                    CreateBooksArray createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    break;
                default:
                    System.out.println("Неправильный выбор. Пожалуйста, выберите снова.");
            }
        }
        System.out.println("Пока");
    }
}