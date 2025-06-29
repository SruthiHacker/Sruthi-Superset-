public class Main {
    public static void main(String[] args) {
        Library lib = new Library(5);

        lib.addBook(new Book("B101", "Java Basics", "John Doe"));
        lib.addBook(new Book("B102", "Python Tricks", "Jane Smith"));
        lib.addBook(new Book("B103", "C++ Mastery", "Alice"));
        lib.addBook(new Book("B104", "Data Structures", "Bob"));

        lib.listBooks();

        
        String searchTitle = "Python Tricks";
        Book result1 = lib.linearSearch(searchTitle);
        System.out.println("\n🔍 Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        
        Book result2 = lib.binarySearch(searchTitle);
        System.out.println("🔎 Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
