package KI304.Chumak.Lab4;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас для обчислення виразу y = sin(x) / (x + tg(x))
 */
public class ExpressionCalculator {

    /**
     * Метод для обчислення виразу
     * @param x вхідне значення
     * @return результат обчислення виразу
     * @throws IllegalArgumentException якщо значення x неприпустиме (наприклад, x = 0)
     */
    public static double calculate(double x) throws IllegalArgumentException {
        // Перевірка на x = 0, оскільки tg(0) = 0 і x + tg(0) = 0 призведе до помилки ділення на нуль
        if (x == 0) {
            throw new IllegalArgumentException("Неможливо обчислити вираз при x = 0: ділення на нуль.");
        }

        // Обчислення виразу
        double result = Math.sin(x) / (x + Math.tan(x));
        return result;
    }

    /**
     * Метод для запису результату в файл
     * @param result результат обчислення
     * @param filename ім'я файлу для запису
     */
    public static void writeToFile(double result, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Результат обчислення: " + result);
        } catch (IOException e) {
            System.out.println("Помилка при записі в файл: " + e.getMessage());
        }
    }
}
