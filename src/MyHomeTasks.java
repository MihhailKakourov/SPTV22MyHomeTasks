import tasks.*;

import java.util.Scanner;

public class MyHomeTasks {

    public MyHomeTasks(){
        Scanner scanner = new Scanner(System.in);
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
            System.out.println("4. Демо Array");
            System.out.println("5. Температура в году");
            System.out.println("6. Тест по таблице умножения");
            System.out.println("7. Китайский календарь");
            System.out.println("8. Содержит ли текст все буквы алфавита");
            System.out.print("Ваш выбор: ");

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
                case 4:
                    System.out.println("Выбрана задача демо Array");
                    ArrayDemo arrayDemo = new ArrayDemo();
                    arrayDemo.doCreateArray();
                    break;
                case 5:
                    System.out.println("Выбрана задача погода");
                    Weather weather = new Weather();
                    weather.showWeather();
                    break;
                case 6:
                    System.out.println("Выбрана задача тест по таблице умножения");
                    Quiz quiz = new Quiz();
                    quiz.startQuiz();
                    break;
                case 7:
                    System.out.println("Выбрана задача китайский календарь");
                    ChineseCalendar chineseCalendar = new ChineseCalendar();
                    chineseCalendar.showCalendar();
                    break;
                case 8:
                    System.out.println("Выбрана задача содержит ли текст все буквы алфавита");
                    LetterChecker letterChecker = new LetterChecker();
                    LetterChecker.checkAlphabet();
                    break;

                default:
                    System.out.println("Неправильный выбор. Пожалуйста, выберите снова.");
            }
        }
        System.out.println("Пока");
    }
}