package SearchField;

import java.util.*;

public class SearchExample {

    public static void main(String[] args) {

        List<String> data = Arrays.asList(
                "Mango",
                "Orange",
                "Lemon",
                "Coconut"
        );

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter search text: ");
        String query = sc.nextLine().toLowerCase();

        System.out.println("\nSearch Results:");

        for (String item : data) {
            if (item.toLowerCase().contains(query)) {
                System.out.println(item);
            }
        }
    }
}