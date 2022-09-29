import otherTasks.*;
import task9.Ball;
import task9.Basket;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import static task1.Task1.calculateValueByFormula;
import static task2.Task2.belongsToShadedArea;
import static task3.Task3.calculateValuesOfFunctionOnSegment;
import static task4.Task4.checkArrayForPrimeNumbers;
import static task5.Task5.findSmallestNumberOfElements;
import static task6.Task6.getSquareMatrixN;
import static task7.Task7.sortShell;
import static task8.Task8.findPlacesToInsertSequenceElements;

public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1: \n" + calculateValueByFormula(1, 1));
        System.out.println();

        //Task 2
        System.out.println("Task 2 (1): \n" + belongsToShadedArea(3, 0));
        System.out.println("Task 2 (2): \n" + belongsToShadedArea(5, 1));
        System.out.println("Task 2 (3): \n" + belongsToShadedArea(0, -7));
        System.out.println();

        //Task 3
        System.out.println("Task 3 (1): ");
        calculateValuesOfFunctionOnSegment(0, 0, 10, 0.5);
        System.out.println("Task 3 (2): ");
        calculateValuesOfFunctionOnSegment(0, 1, 10, 0.5);
        System.out.println();

        //Task 4
        System.out.println("Task 4: ");
        checkArrayForPrimeNumbers(new int[]{2, 3, 4, 5, 6, 7});
        System.out.println();

        //Task 5
        System.out.println("Task 5: ");
        findSmallestNumberOfElements(new int[]{2, 3, 2, 3, 4, 3, 5, 3, 6, 10, 11});
        System.out.println();
        System.out.println();

        //Task 6
        System.out.println("Task 6: ");
        getSquareMatrixN();
        System.out.println();

        //Task 7
        System.out.println("Task 7: ");
        int[] task7Array = new int[]{124124, 1241421, 1, 0, 0, 1241241, 123456789, 49, 5, 44, 3, 2, 998};
        sortShell(task7Array);
        System.out.println(Arrays.toString(task7Array));
        System.out.println();

        //Task 8
        System.out.println("Task 8: ");
        findPlacesToInsertSequenceElements();
        System.out.println();
        System.out.println();

        //Task 9
        System.out.println("Task 9: ");
        Ball[] ballsArray = new Ball[3];
        ballsArray[0] = new Ball(2.3, "blue");
        ballsArray[1] = new Ball(2.7, "blue");
        ballsArray[2] = new Ball(3, "red");

        Basket basket = new Basket();
        System.out.println("Weight of balls: " + basket.findWeight(ballsArray));
        System.out.println("Number of blue balls: " + basket.findColor(ballsArray));
        System.out.println();

        //Task 12
        System.out.println("Task 12: ");
        Book myBook = new Book("ABC", "ZZZ", 23, 0);
        System.out.println(myBook.equals(myBook));
        System.out.println(myBook.hashCode());
        System.out.println(myBook.toString());
        System.out.println();

        //Task 13
        System.out.println("Task 13: ");
        ProgrammerBook lanBook = new ProgrammerBook("Java", 5);
        System.out.println(lanBook.toString());
        System.out.println();

        //Task 14
        System.out.println("Task 14: ");
        Book anotherBook = (Book) myBook.clone();
        System.out.println(anotherBook.toString());
        System.out.println(myBook.equals(anotherBook));
        System.out.println();

        //Task 15
        System.out.println("Task 15: ");
        TreeSet<Book> myLibrary = new TreeSet<Book>();
        myLibrary.add(new Book("AAA", "JJJ", 65, 2));
        myLibrary.add(new Book("BBB", "NNN", 51, 3));
        myLibrary.add(new Book("HHH", "III", 47, 1));
        myLibrary.add(myBook);
        System.out.println("Library: " + myLibrary.size());
        for (Book lib : myLibrary) {
            System.out.println(lib);
        }
        System.out.println();

        //Task 16
        System.out.println("Task 16: ");
        System.out.println("Title and author: ");
        Comparator<Book> compareByTitleThenAuthor = new CompareByTitle().thenComparing(new CompareByAuthor());
        TreeSet<Book> myLibrary2 = new TreeSet(compareByTitleThenAuthor);
        myLibrary2.add(new Book("JKL", "OIU", 65, 2));
        myLibrary2.add(new Book("LHG", "WER", 51, 3));
        myLibrary2.add(new Book("UTR", "LOI", 47, 1));
        myLibrary2.add(myBook);
        for (Book Lib : myLibrary2) {
            System.out.println(Lib);
        }

        System.out.println("Author and title: ");
        Comparator<Book> compareByAuthorThenTitle = new CompareByAuthor().thenComparing(new CompareByTitle());
        TreeSet<Book> myLibrary3 = new TreeSet(compareByAuthorThenTitle);
        myLibrary3.add(new Book("JUG", "FDF", 65, 2));
        myLibrary3.add(new Book("WER", "OJJ", 51, 3));
        myLibrary3.add(new Book("OJN", "JHV", 47, 1));
        myLibrary3.add(myBook);
        for (Book Lib : myLibrary3) {
            System.out.println(Lib);
        }

        System.out.println("Author, title and price: ");
        Comparator<Book> compareByAuthorThenTitleThenPrice = new CompareByAuthor().thenComparing(new CompareByTitle().thenComparing(new CompareByPrice()));
        TreeSet<Book> myLibrary4 = new TreeSet(compareByAuthorThenTitleThenPrice);
        myLibrary4.add(new Book("BGV", "JBB", 65, 2));
        myLibrary4.add(new Book("JBH", "OOO", 51, 3));
        myLibrary4.add(new Book("AIU", "POI", 47, 1));
        myLibrary4.add(myBook);
        for (Book Lib : myLibrary4) {
            System.out.println(Lib);
        }
    }
}
