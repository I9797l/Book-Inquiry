import java.util.HashSet;

public class BookInquiryHashSet {

    HashSet<String> books = new HashSet<>();

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public boolean searchBook(String bookName) {
        return books.contains(bookName);
    }

    public void displayBooks() {
        System.out.println("Available Books: " + books);
    }
}
