import java.util.*;

public class BookSorter {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));

        System.out.println("Original list:");
        books.forEach(System.out::println);

        // Sorting by default (title)
        Collections.sort(books);
        System.out.println("\nSorted by title:");
        books.forEach(System.out::println);

        // Sorting by author
        books.sort(new AuthorComparator());
        System.out.println("\nSorted by author:");
        books.forEach(System.out::println);

        // Sorting by year
        books.sort(new YearComparator());
        System.out.println("\nSorted by year:");
        books.forEach(System.out::println);

        // Sorting by author, then title
        books.sort(new AuthorTitleComparator());
        System.out.println("\nSorted by author, then title:");
        books.forEach(System.out::println);
    }
}
