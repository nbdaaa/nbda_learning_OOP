
package OOP.BookandAuthorClass;


public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, double price, int qty, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
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

    @Override
    public String toString() {
        return "Book Details: " + "name = " + name + ", price=" + price + ", qty=" + qty + "\nAuthor Information: " + author.toString()  ;
    }
    
    
    
}
