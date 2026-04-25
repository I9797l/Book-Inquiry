import java.util.HashSet;

public class BookInquirySystem {

    // Solution 1: Linear Search
    // This method searches for a book one by one
    public static void linearSearch(String[] books, String target) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(target)) {
                System.out.println("Linear Search: Book found");
                return;
            }
        }
        System.out.println("Linear Search: Book not found");
    }

    // Solution 2: HashSet Search
    // This method searches using HashSet (faster)
    public static void hashSearch(HashSet<String> books, String target) {
        if (books.contains(target)) {
            System.out.println("HashSet Search: Book found");
        } else {
            System.out.println("HashSet Search: Book not found");
        }
    }

    public static void main(String[] args) {

        // Data for Solution 1
        String[] books = {"Math", "Science", "History"};

        // Test Solution 1
        linearSearch(books, "Math");

        // Data for Solution 2
        HashSet<String> set = new HashSet<>();
        set.add("Math");
        set.add("Science");
        set.add("History");

        // Test Solution 2
        hashSearch(set, "Math");
    }
