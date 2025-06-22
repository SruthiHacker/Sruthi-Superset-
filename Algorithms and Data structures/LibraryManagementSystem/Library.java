import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
            System.out.println("Added: " + book);
        } else {
            System.out.println("Library is full.");
        }
    }

    public void listBooks() {
        System.out.println("\n Library Books:");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    
    public Book linearSearch(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    
    public Book binarySearch(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));

        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
