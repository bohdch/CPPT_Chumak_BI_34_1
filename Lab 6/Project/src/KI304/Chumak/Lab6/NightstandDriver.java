package KI304.Chumak.Lab6;

/**
 * Клас NightstandTest для тестування та демонстрації роботи класу Nightstand.
 */
public class NightstandDriver {
    public static void main(String[] args) {
        Nightstand<Book> bookNightstand = new Nightstand<>();
        bookNightstand.addItem(new Book("Java Programming", 1.5));
        bookNightstand.addItem(new Book("Data Structures", 2.0));
        bookNightstand.addItem(new Book("Algorithms", 1.2));

        System.out.println("Книги в тумбочці:");
        bookNightstand.displayItems();
        System.out.println("Найважча книга: " + bookNightstand.findMax());

        Nightstand<Jewelry> jewelryNightstand = new Nightstand<>();
        jewelryNightstand.addItem(new Jewelry("Gold Ring", 500.0));
        jewelryNightstand.addItem(new Jewelry("Silver Necklace", 300.0));
        jewelryNightstand.addItem(new Jewelry("Diamond Earring", 1500.0));

        System.out.println("\nПрикраси в тумбочці:");
        jewelryNightstand.displayItems();
        System.out.println("Найдорожча прикраса: " + jewelryNightstand.findMax());
    }
}
