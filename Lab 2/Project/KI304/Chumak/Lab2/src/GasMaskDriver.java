package KI304.Chumak.Lab2;

/**
 * Клас GasMaskDriver для тестування функціональності класу GasMask.
 * Цей клас емулює реальне використання протигазу.
 */
public class GasMaskDriver {

    public static void main(String[] args) {
        // Створення об'єкта GasMask з використанням конструктора за замовчуванням
        GasMask gasMask = new GasMask();

        // Емулюємо реальну послідовність дій
        System.out.println("Тестування GasMask починається...");

        // Перевірка фільтра перед використанням
        gasMask.checkFilter();

        // Одягаємо протигаз
        gasMask.wear();

        // Чистимо маску перед використанням
        gasMask.cleanMask();

        // Перевірка клапана перед використанням
        gasMask.checkValve();

        // Відкриваємо клапан
        gasMask.openValve();

        // Заміна фільтра після певного часу використання
        gasMask.replaceFilter();
        gasMask.checkFilter(); // Перевіряємо новий фільтр

        // Закриваємо клапан після використання
        gasMask.closeValve();

        // Знімаємо протигаз
        gasMask.remove();

        // Чистимо маску після використання
        gasMask.cleanMask();

        // Завершення роботи з протигазом
        gasMask.closeLog();

        // Повідомлення про завершення тестування
        System.out.println("Тестування GasMask завершено. Перевірте файл 'gasMask-log.txt' для деталей.");
    }
}
