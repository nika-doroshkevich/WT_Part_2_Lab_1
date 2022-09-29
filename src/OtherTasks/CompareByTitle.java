package OtherTasks;

import java.util.Comparator;

public class CompareByTitle implements Comparator<Book> {

    public int compare(Book a, Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}
