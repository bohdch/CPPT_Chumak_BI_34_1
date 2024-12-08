package KI304.Chumak.Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас GasMask представляє протигаз з основними компонентами,
 * такими як фільтр, маска і клапан.
 * Цей клас управляє процесом використання протигазу, перевіркою його компонентів
 * і веде журнал дій.
 */
public class GasMask {
    private Filter filter;
    private Mask mask;
    private Valve valve;
    private BufferedWriter logWriter;

    /**
     * Конструктор за замовчуванням. Ініціалізує фільтр, маску та клапан,
     * а також ініціалізує лог-файл.
     */
    public GasMask() {
        this.filter = new Filter();
        this.mask = new Mask();
        this.valve = new Valve();
        initLog();
    }

    /**
     * Конструктор з параметрами для створення протигазу з заданими компонентами.
     *
     * @param filter фільтр протигазу
     * @param mask маска протигазу
     * @param valve клапан протигазу
     */
    public GasMask(Filter filter, Mask mask, Valve valve) {
        this.filter = filter;
        this.mask = mask;
        this.valve = valve;
        initLog();
    }

    /**
     * Ініціалізація лог-файлу для запису дій з протигазом.
     */
    private void initLog() {
        try {
            logWriter = new BufferedWriter(new FileWriter("gasMask-log.txt", true));
            log("Створено об'єкт GasMask.");
        } catch (IOException e) {
            System.out.println("Помилка ініціалізації лог-файлу: " + e.getMessage());
        }
    }

    /**
     * Запис повідомлення в лог-файл.
     *
     * @param message повідомлення для запису в лог
     */
    private void log(String message) {
        try {
            logWriter.write(message + "\n");
            logWriter.flush();
        } catch (IOException e) {
            System.out.println("Помилка запису в лог: " + e.getMessage());
        }
    }

    /**
     * Одягає протигаз і встановлює маску як "одягнену".
     */
    public void wear() {
        log("Протигаз одягнено.");
        mask.setWorn(true);  // Встановлюємо стан маски як "одягнута"
    }

    /**
     * Знімає протигаз і встановлює маску як "зняту".
     */
    public void remove() {
        log("Протигаз знято.");
        mask.setWorn(false); // Встановлюємо стан маски як "знята"
    }

    /**
     * Перевіряє стан фільтра протигазу. Якщо фільтр потребує заміни, записується відповідне повідомлення.
     */
    public void checkFilter() {
        log("Перевірка фільтра.");
        if (filter.isExpired()) {
            log("Фільтр потребує заміни.");
        } else {
            log("Фільтр у робочому стані.");
        }
    }

    /**
     * Заміна фільтра протигазу на новий.
     */
    public void replaceFilter() {
        filter = new Filter();
        log("Фільтр замінено.");
    }

    /**
     * Очищає маску протигазу. Якщо маска одягнута, очищення неможливе.
     */
    public void cleanMask() {
        if (mask.isWorn()) {
            log("Неможливо очистити маску, поки вона одягнута.");
        } else {
            mask.clean();
            log("Маска очищена.");
        }
    }

    /**
     * Перевіряє стан клапана протигазу.
     */
    public void checkValve() {
        log("Перевірка клапана.");
        if (valve.isOpen()) {
            log("Клапан відкритий.");
        } else {
            log("Клапан закритий.");
        }
    }

    /**
     * Закриває клапан протигазу.
     */
    public void closeValve() {
        valve.close();
        log("Клапан закритий.");
    }

    /**
     * Відкриває клапан протигазу.
     */
    public void openValve() {
        valve.open();
        log("Клапан відкритий.");
    }

    /**
     * Завершує роботу з лог-файлом. Записує повідомлення про завершення роботи та закриває файл.
     */
    public void closeLog() {
        try {
            if (logWriter != null) {
                log("Завершення роботи.");
                logWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Помилка закриття лог-файлу: " + e.getMessage());
        }
    }
}