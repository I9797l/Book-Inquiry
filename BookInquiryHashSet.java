import java.util.HashSet;

public class BookInquiryHashSet {

    // HashSet is used to store unique book titles
    HashSet<String> books = new HashSet<>();

    // This method adds a new book to the collection
    public void addBook(String bookName) {
        books.add(bookName);
    }

    // This method checks if a book exists in the HashSet
    // It uses contains() which is very fast (O(1) on average)
    public boolean searchBook(String bookName) {
        return books.contains(bookName);    // Returns true if found, false otherwise
    }

    // This method displays all available books in the system
    public void displayBooks() {
        System.out.println("Available Books: " + books);
    }
}
