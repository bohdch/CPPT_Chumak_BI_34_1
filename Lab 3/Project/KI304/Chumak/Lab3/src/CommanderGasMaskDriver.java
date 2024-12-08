package KI304.Chumak.Lab3;

public class CommanderGasMaskDriver {

    public static void main(String[] args) {
        // Створюємо об'єкт CommanderGasMask
        CommanderGasMask commanderGasMask = new CommanderGasMask();

        // Тестуємо одягання протигазу
        commanderGasMask.wear();

        // Тестуємо перевірку фільтра
        commanderGasMask.checkFilter();

        // Тестуємо увімкнення режиму надзвичайної ситуації
        commanderGasMask.enableEmergencyMode();

        // Тестуємо рівень заряду батареї
        commanderGasMask.checkBatteryLevel();

        // Тестуємо виконання команди в режимі надзвичайної ситуації
        commanderGasMask.executeCommand();

        // Тестуємо трансляцію команди через систему зв'язку
        commanderGasMask.broadcastCommand("Перехід до нової позиції");

        // Тестуємо вимкнення режиму надзвичайної ситуації
        commanderGasMask.disableEmergencyMode();

        // Тестуємо зниження заряду батареї
        commanderGasMask.checkBatteryLevel();

        // Тестуємо зняття протигазу
        commanderGasMask.remove();

        // Завершуємо роботу з лог-файлом
        commanderGasMask.closeLog();
    }
}