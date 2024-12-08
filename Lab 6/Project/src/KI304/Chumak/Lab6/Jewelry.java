package KI304.Chumak.Lab6;

/**
 * Клас Jewelry представляє прикрасу з атрибутом ціни для порівняння.
 */
public class Jewelry implements Comparable<Jewelry> {
    private String name;
    private double price;

    public Jewelry(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Jewelry other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Прикраса: " + name + ", Ціна: " + price;
    }
}