package KI304.Chumak.Lab6;

/**
 * Клас Book представляє книгу з атрибутом ваги для порівняння.
 */
public class Book implements Comparable<Book> {
    private String title;
    private double weight;

    public Book(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Book other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", Вага: " + weight;
    }
}
