import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("What is your name? ");

        String text = scanner.nextLine();

        // Print the user's text that was entered
        System.out.println("Hello " + text);
    }
}
