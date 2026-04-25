import java.util.ArrayList;

public class BookInquiry {
    
    // This method performs a linear search on the list of books
    // It checks each book one by one until it finds the target book
    public static boolean linearSearch(ArrayList<String> books, String target) {
        
        // Loop through each book in the list
        for (String book : books) {

            // Compare each book with the target (ignoring case sensitivity)
            if (book.equalsIgnoreCase(target)) {
                return true;
            }
        }

        // If no match is found after checking all books
        return false;    // Book not found
    }
}
