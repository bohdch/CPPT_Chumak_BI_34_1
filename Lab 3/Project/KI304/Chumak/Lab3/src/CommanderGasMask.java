package KI304.Chumak.Lab3;

import KI304.Chumak.Lab3.interfaces.Commandable;

/**
 * Клас CommanderGasMask розширює GasMask, додаючи функціональність
 * специфічну для використання командиром, та реалізує інтерфейс Commandable.
 * Це включає режим надзвичайної ситуації, моніторинг батареї та функції зв'язку.
 */
public class CommanderGasMask extends GasMask implements Commandable {
    private boolean isEmergencyModeEnabled;
    private int batteryLevel; // Гіпотетичний рівень заряду батареї для вбудованих систем

    /**
     * Конструктор за замовчуванням для CommanderGasMask.
     * Ініціалізує стандартні компоненти, вимкнений командний режим і повну батарею.
     */
    public CommanderGasMask() {
        super();
        this.isEmergencyModeEnabled = false;
        this.batteryLevel = 100; // Батарея починає з рівня 100%
        initLog("commanderGasMask-log.txt");
    }

    /**
     * Конструктор з параметрами для створення налаштованого командирського протигазу.
     *
     * @param filter фільтр для протигазу
     * @param mask компонент маски
     * @param valve компонент клапана
     */
    public CommanderGasMask(Filter filter, Mask mask, Valve valve) {
        super(filter, mask, valve);
        this.isEmergencyModeEnabled = false;
        this.batteryLevel = 100;
        initLog("commanderGasMask-log.txt");
    }

    /**
     * Увімкнення режиму надзвичайної ситуації, який пріоритизує дії безпеки,
     * автоматично закриває клапан та перевіряє фільтр.
     */
    public void enableEmergencyMode() {
        isEmergencyModeEnabled = true;
        log("Режим надзвичайної ситуації увімкнено.");
        closeValve(); // Забезпечення закриття клапана для безпеки
        checkFilter();
    }

    /**
     * Вимкнення режиму надзвичайної ситуації.
     */
    public void disableEmergencyMode() {
        isEmergencyModeEnabled = false;
        log("Режим надзвичайної ситуації вимкнено.");
    }

    /**
     * Моніторинг рівня заряду батареї для будь-яких інтегрованих систем.
     *
     * @return поточний рівень заряду батареї
     */
    public int checkBatteryLevel() {
        log("Рівень заряду батареї перевірено: " + batteryLevel + "%");
        return batteryLevel;
    }

    /**
     * Зменшує рівень заряду батареї внаслідок виконання певних дій, імітуючи використання батареї.
     *
     * @param usage кількість заряду, яку потрібно зменшити
     */
    private void reduceBattery(int usage) {
        batteryLevel = Math.max(batteryLevel - usage, 0);
        log("Заряд батареї зменшено на " + usage + "%. Поточний рівень: " + batteryLevel + "%");
    }

    /**
     * Передає команду або повідомлення через систему зв'язку протигазу.
     *
     * @param message команда або повідомлення для трансляції
     */
    public void broadcastCommand(String message) {
        if (batteryLevel > 10) {
            log("Трансляція повідомлення: " + message);
            reduceBattery(10); // Трансляція використовує певну частину заряду батареї
        } else {
            log("Заряд батареї занадто низький для трансляції.");
        }
    }

    /**
     * Виконує команду, пов'язану з командирським протигазом.
     */
    public void executeCommand() {
        if (isEmergencyModeEnabled) {
            log("Виконання високопріоритетної команди в режимі надзвичайної ситуації.");
            // Додайте поведінку для команд у надзвичайному режимі тут
        } else {
            log("Виконання стандартної команди.");
            // Додайте поведінку для стандартних команд тут
        }
    }
}