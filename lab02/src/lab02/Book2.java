package lab02;

public class Book2 {

    private final String name;
    private final Author[] author;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book2(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        StringBuilder authornames = new StringBuilder("\"");
        for (Author author1 : this.author) {
            authornames.append(author1.getName());
            if (author1 != this.author[author.length-1]){
                authornames.append(", ");
            }
        }
        authornames.append("\"");
        return authornames.toString();
    }

     @Override
    public String toString() {
        
        StringBuilder authors = new StringBuilder();
        for (Author author1 : this.author) {
            authors.append(author1);
            if (author1 != this.author[author.length-1]){
                authors.append(", ");
            }
        }
        
        return "Book.auther[][" +
                "name='" + this.name + '\'' +
                ", " + authors +
                ", price=" + this.price +
                ", qty=" + this.qty +
                ']';
    }
    


}
