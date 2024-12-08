package KI304.Chumak.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас Nightstand представляє тумбочку як контейнер для різних предметів.
 * @param <T> тип елементів, що зберігаються у тумбочці, які повинні реалізовувати інтерфейс Comparable.
 */
public class Nightstand<T extends Comparable<T>> {
    private List<T> items;

    /**
     * Конструктор для створення пустої тумбочки.
     */
    public Nightstand() {
        this.items = new ArrayList<>();
    }

    /**
     * Метод для додавання елемента у тумбочку.
     * @param item елемент для додавання.
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Метод для видалення елемента з тумбочки.
     * @param item елемент для видалення.
     * @return true якщо елемент було видалено, інакше false.
     */
    public boolean removeItem(T item) {
        return items.remove(item);
    }

    /**
     * Метод для пошуку максимального елемента у тумбочці.
     * @return максимальний елемент, або null, якщо тумбочка пуста.
     */
    public T findMax() {
        if (items.isEmpty()) {
            return null;
        }
        T maxItem = items.get(0);
        for (T item : items) {
            if (item.compareTo(maxItem) > 0) {
                maxItem = item;
            }
        }
        return maxItem;
    }

    /**
     * Метод для перегляду всіх елементів у тумбочці.
     */
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
