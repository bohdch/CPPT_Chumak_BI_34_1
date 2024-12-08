package KI304.Chumak.Lab4;

import java.util.Scanner;

import static KI304.Chumak.Lab4.ExpressionCalculator.calculate;
import static KI304.Chumak.Lab4.ExpressionCalculator.writeToFile;

/**
 * Клас CalculatorDriver є драйвером для обчислення виразу y = sin(x) / (x + tg(x)).
 * Він відповідає за введення значення x, обчислення виразу та запис результату у файл.
 */
public class CalculatorDriver {

    /**
     * Головний метод програми, що запитує у користувача значення x, обчислює вираз та
     * записує результат у файл.
     *
     * @param args параметри командного рядка
     */
    public static void main(String[] args) {
        // Створення об'єкта Scanner для вводу з консолі
        Scanner scanner = new Scanner(System.in);

        // Запит на введення значення x
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        try {
            // Обчислення виразу
            double result = calculate(x);

            // Виведення результату на консоль
            System.out.println("Результат обчислення: " + result);

            // Запис результату в файл
            writeToFile(result, "output.txt");

        } catch (IllegalArgumentException e) {
            // Обробка виключення в разі помилки обчислення (наприклад, ділення на нуль)
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
