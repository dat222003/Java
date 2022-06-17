package lab02.src.lab02;

public class Book1 {

    private final String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book1(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book1(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book1[" +
                "name='" + this.name + '\'' +
                ", " + this.author +
                ", price=" + this.price +
                ", qty=" + this.qty +
                ']';
    }
}
