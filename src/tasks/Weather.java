package tasks;
import java.util.Scanner;
import java.util.Random;

public class Weather {
    public void showWeather() {
        Scanner inputScanner = new Scanner(System.in);

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
                double temperature = -20 + random.nextDouble() * 60;
                temperatureData[month][day] = temperature;
            }
        }

        System.out.print("Введит месяц (1-12): ");
        int monthInput = inputScanner.nextInt();
        System.out.print("Введите день (1-31): ");
        int dayInput = inputScanner.nextInt();

        double temperature = temperatureData[monthInput - 1][dayInput - 1];
        double roundedTemperature = Math.round(temperature * 10.0) / 10.0;
        System.out.println("Температура в этот день: " + roundedTemperature + " градусов");

        double maxTemperature = Double.MIN_VALUE;
        double minTemperature = Double.MAX_VALUE;
        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < temperatureData[month].length; day++) {
                if (temperatureData[month][day] > maxTemperature) {
                    maxTemperature = temperatureData[month][day];
                }
                if (temperatureData[month][day] < minTemperature) {
                    minTemperature = temperatureData[month][day];
                }
            }
        }
        double roundedMaxTemperature = Math.round(maxTemperature * 10.0) / 10.0;
        double roundedMinTemperature = Math.round(minTemperature * 10.0) / 10.0;
        System.out.println("Самым теплым был: " + roundedMaxTemperature + " градусов");
        System.out.println("Самым холодным был: " + roundedMinTemperature + " градусов");

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
            System.out.println("Среденяя темперутара в месяце " + (month + 1) + ": " + roundedAverageTemperature + " градусов");
        }
    }
}