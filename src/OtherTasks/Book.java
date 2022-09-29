package OtherTasks;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book() {
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price;
    }

    @Override
    public int hashCode() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{"
                + "title='" + title + '\''
                + ", author=" + author
                + ", price=" + price
                + ", isbn=" + isbn
                + '}';
    }

    public Object clone() {
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.author = this.author;
        newBook.price = this.price;
        return newBook;
    }

    @Override
    public int compareTo(Book o) {
        return isbn - o.isbn;
    }
}