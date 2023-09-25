import java.util.Scanner;

public class App {
    private Scanner scanner;

    public App(){
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
                default:
                    System.out.println("Неправильный выбор. Пожалуйста, выберите снова.");
            }
        }
        System.out.println("Пока");
    }
}