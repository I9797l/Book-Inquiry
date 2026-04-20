import java.util.ArrayList;

public class BookInquiry {

    // Solution1 : Linear Search
    public static boolean linearSearch(ArrayList<String> books, String target) {
        for (String book : books) {
            if (book.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }
}
