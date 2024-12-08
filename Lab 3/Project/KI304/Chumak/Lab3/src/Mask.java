package KI304.Chumak.Lab3;

/**
 * Клас Mask представляє маску протигазу.
 * Маска може бути очищена або забруднена, а також може бути одягнена чи знята.
 */
public class Mask {
    private boolean isClean;  // Статус чистоти маски
    private boolean isWorn;   // Статус одягнутості маски

    /**
     * Конструктор за замовчуванням, ініціалізує маску як чисту і не одягнену.
     */
    public Mask() {
        this.isClean = true;  // Маска чиста за замовчуванням
        this.isWorn = false;  // Маска не одягнена за замовчуванням
    }

    /**
     * Метод для перевірки чи маска чиста.
     *
     * @return true, якщо маска чиста, false — якщо забруднена.
     */
    public boolean isClean() {
        return isClean;
    }

    /**
     * Метод для перевірки чи маска одягнена.
     *
     * @return true, якщо маска одягнена, false — якщо знята.
     */
    public boolean isWorn() {
        return isWorn;
    }

    /**
     * Встановлює статус маски як одягнута або знята.
     *
     * @param worn статус одягнутості маски.
     */
    public void setWorn(boolean worn) {
        this.isWorn = worn;
    }

    /**
     * Очищає маску, встановлюючи її статус як чисту.
     */
    public void clean() {
        this.isClean = true;
    }

    /**
     * Забруднює маску, встановлюючи її статус як забруднену.
     */
    public void makeDirty() {
        this.isClean = false;
    }
}