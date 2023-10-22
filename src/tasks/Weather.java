package tasks;
import java.util.Scanner;
import java.util.Random;

public class Weather {
    public void showWeather() {
        Scanner inputScanner = new Scanner(System.in);

        String[] months = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };

        double[][] temperatureData = new double[12][];
        temperatureData[0] = new double[31];
        temperatureData[1] = new double[28];
        temperatureData[2] = new double[31];
        temperatureData[3] = new double[30];
        temperatureData[4] = new double[31];
        temperatureData[5] = new double[30];
        temperatureData[6] = new double[31];
        temperatureData[7] = new double[31];
        temperatureData[8] = new double[30];
        temperatureData[9] = new double[31];
        temperatureData[10] = new double[30];
        temperatureData[11] = new double[31];

        Random random = new Random();
        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < temperatureData[month].length; day++) {
                double winterTemperature = random.nextDouble() * 15 - 30; // от -30 до -15
                double springTemperature = random.nextDouble() * 20 - 10; // от -10 до 10
                double summerTemperature = random.nextDouble() * 20 + 10; // от 10 до 30
                double autumnTemperature = random.nextDouble() * 25 - 15; // от -15 до 10
                switch (month) {
                    case 11:
                    case 0:
                    case 1:
                        temperatureData[month][day] = winterTemperature;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        temperatureData[month][day] = springTemperature;
                        break;
                    case 5:
                    case 6:
                    case 7:
                        temperatureData[month][day] = summerTemperature;
                        break;
                    case 8:
                    case 9:
                    case 10:
                        temperatureData[month][day] = autumnTemperature;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.print("Введите месяц (1-12): ");
        int monthInput = inputScanner.nextInt();
        System.out.print("Введите день (1-31): ");
        int dayInput = inputScanner.nextInt();

        double temperature = temperatureData[monthInput - 1][dayInput - 1];
        double roundedTemperature = Math.round(temperature * 10.0) / 10.0;
        System.out.println("Температура в этот день (" + dayInput + " " + months[monthInput - 1] + "): " + roundedTemperature + " градусов");

        double maxTemperature = -30; // Минимально возможная температура
        double minTemperature = 30;  // Максимально возможная температура
        String maxMonth = "";
        String minMonth = "";

        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < temperatureData[month].length; day++) {
                if (temperatureData[month][day] > maxTemperature) {
                    maxTemperature = temperatureData[month][day];
                    maxMonth = months[month];
                }
                if (temperatureData[month][day] < minTemperature) {
                    minTemperature = temperatureData[month][day];
                    minMonth = months[month];
                }
            }
        }

        double roundedMaxTemperature = Math.round(maxTemperature * 10.0) / 10.0;
        double roundedMinTemperature = Math.round(minTemperature * 10.0) / 10.0;

        System.out.println("Самым теплым был " + maxMonth + ": " + roundedMaxTemperature + " градусов");
        System.out.println("Самым холодным был " + minMonth + ": " + roundedMinTemperature + " градусов");

        double[] averageTemperatures = new double[12];
        for (int month = 0; month < 12; month++) {
            double sum = 0;
            for (int day = 0; day < temperatureData[month].length; day++) {
                sum += temperatureData[month][day];
            }
            averageTemperatures[month] = sum / temperatureData[month].length;
        }

        for (int month = 0; month < 12; month++) {
            double roundedAverageTemperature = Math.round(averageTemperatures[month] * 10.0) / 10.0;
            System.out.println("Средняя температура в " + months[month] + ": " + roundedAverageTemperature + " градусов");
        }
    }
}
