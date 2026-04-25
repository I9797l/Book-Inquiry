import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("Math");
        books.add("Science");
        books.add("English");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String userBook = input.nextLine();

        boolean result = BookInquiry.linearSearch(books, userBook);

        if (result) {
            System.out.println("Book found");
        } else {
            System.out.println("Book not found");
        }
    }
}
