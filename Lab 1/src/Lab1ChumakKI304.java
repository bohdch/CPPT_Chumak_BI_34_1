import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Клас Lab1ChumakKI304 генерує квадратну матрицю символів,
 * заповнену вказаним символом. Виводить матрицю на екран та
 * зберігає її у текстовий файл.
 */
public class Lab1ChumakKI304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриці: ");
        int size = scanner.nextInt();

        System.out.print("Введіть символ заповнювача: ");
        String symbolInput = scanner.next();

        if (symbolInput.length() != 1) {
            System.out.println("Помилка: потрібно ввести один символ!");
            return;
        }

        char symbol = symbolInput.charAt(0);

        char[][] matrix = new char[size][];

        for (int i = 0; i < size; i++) {
            matrix[i] = new char[size];
            for (int j = 0; j < size; j++) {
                if (i + j < size) { // Заштрихована область
                    matrix[i][j] = symbol;
                } else {
                    matrix[i][j] = ' '; // Порожня частина
                }
            }
        }

        printMatrix(matrix);

        try {
            saveMatrixToFile(matrix, "matrix_output.txt");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
    }

    /**
     * Виводить матрицю на екран.
     *
     * @param matrix Матриця, яку потрібно вивести.
     */
    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Зберігає матрицю у текстовий файл.
     *
     * @param matrix   Матриця, яку потрібно зберегти.
     * @param fileName Назва файлу, куди буде збережена матриця.
     * @throws IOException Якщо виникає помилка введення/виведення.
     */
    public static void saveMatrixToFile(char[][] matrix, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (char[] row : matrix) {
            for (char element : row) {
                writer.write(element + " ");
            }
            writer.write("\n");
        }
        writer.close();
    }
}