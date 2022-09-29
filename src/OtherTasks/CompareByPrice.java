package OtherTasks;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Book> {

    public int compare(Book a, Book b) {

        if (a.getPrice() > b.getPrice())
            return 1;
        else if (a.getPrice() < b.getPrice())
            return -1;
        else
            return 0;
    }
}
