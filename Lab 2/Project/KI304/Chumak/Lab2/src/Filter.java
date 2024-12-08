package KI304.Chumak.Lab2;

/**
 * Клас Filter представляє фільтр протигазу.
 * Фільтр може бути у робочому стані або вичерпаним (протермінованим).
 */
public class Filter {
    private boolean expired;  // Статус терміну придатності фільтра

    /**
     * Конструктор за замовчуванням.
     * Ініціалізує новий фільтр як робочий (не вичерпаний).
     */
    public Filter() {
        this.expired = false; // Ініціалізуємо новий фільтр як робочий
    }

    /**
     * Метод для перевірки, чи вичерпаний фільтр.
     *
     * @return true, якщо фільтр вичерпаний, false — якщо фільтр ще не вичерпаний.
     */
    public boolean isExpired() {
        return expired;
    }

    /**
     * Метод для встановлення статусу фільтра як вичерпаний або робочий.
     *
     * @param expired статус терміну придатності фільтра (true — вичерпаний, false — робочий).
     */
    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}