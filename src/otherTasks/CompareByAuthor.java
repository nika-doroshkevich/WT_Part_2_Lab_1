package otherTasks;

import java.util.Comparator;

public class CompareByAuthor implements Comparator<Book> {

    public int compare(Book a, Book b) {
        return a.getAuthor().compareTo(b.getAuthor());
    }
}