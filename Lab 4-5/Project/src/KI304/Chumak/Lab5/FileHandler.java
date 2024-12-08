package KI304.Chumak.Lab5;

import java.io.*;
import java.util.Scanner;

/**
 * Клас FileHandler відповідає за читання та запис результатів обчислень у текстовому і двійковому форматах.
 */
public class FileHandler {

    /**
     * Записує результат у текстовий файл.
     *
     * @param result результат обчислення, який буде записаний у файл
     * @param filename ім'я текстового файлу
     */
    public static void writeToTextFile(double result, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(Double.toString(result));
        } catch (IOException e) {
            System.out.println("Помилка при записі в текстовий файл: " + e.getMessage());
        }
    }

    /**
     * Зчитує результат із текстового файлу.
     *
     * @param filename ім'я текстового файлу
     * @return зчитане значення результату
     */
    public static double readFromTextFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні з текстового файлу: " + e.getMessage());
        }
        return Double.NaN; // Повертає NaN, якщо виникла помилка
    }

    /**
     * Записує результат у двійковий файл.
     *
     * @param result результат обчислення, який буде записаний у файл
     * @param filename ім'я двійкового файлу
     */
    public static void writeToBinaryFile(double result, String filename) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeDouble(result);
        } catch (IOException e) {
            System.out.println("Помилка при записі в двійковий файл: " + e.getMessage());
        }
    }

    /**
     * Зчитує результат із двійкового файлу.
     *
     * @param filename ім'я двійкового файлу
     * @return зчитане значення результату
     */
    public static double readFromBinaryFile(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            return dis.readDouble();
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні з двійкового файлу: " + e.getMessage());
        }
        return Double.NaN;
    }
}