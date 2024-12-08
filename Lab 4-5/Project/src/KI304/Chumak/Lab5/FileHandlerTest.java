package KI304.Chumak.Lab5;

import KI304.Chumak.Lab4.ExpressionCalculator;
import java.util.Scanner;

/**
 * Клас FileHandlerTest є тестовим класом, який перевіряє роботу з методами запису та
 * читання результатів з текстових і двійкових файлів. Він також взаємодіє з класом
 * ExpressionCalculator для обчислення математичного виразу.
 */
public class FileHandlerTest {
    /**
     * Головний метод програми, що виконує обчислення виразу, записує результат в
     * текстовий і двійковий файл, а також зчитує результат з цих файлів.
     *
     * @param args параметри командного рядка
     */
    public static void main(String[] args) {
        // Створення об'єкта Scanner для вводу з консолі
        Scanner scanner = new Scanner(System.in);

        // Запит на введення значення x
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        // Обчислення результату за допомогою класу ExpressionCalculator
        double result = ExpressionCalculator.calculate(x);

        // Запис результату в текстовий файл і читання з нього
        String textFile = "result.txt";
        FileHandler.writeToTextFile(result, textFile);
        System.out.println("Прочитано з текстового файлу: " + FileHandler.readFromTextFile(textFile));

        // Запис результату в двійковий файл і читання з нього
        String binaryFile = "result.bin";
        FileHandler.writeToBinaryFile(result, binaryFile);
        System.out.println("Прочитано з двійкового файлу: " + FileHandler.readFromBinaryFile(binaryFile));
    }
}
