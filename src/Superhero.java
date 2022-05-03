import java.util.Scanner;

public class Superhero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero." + "\n" + "Who is the hero of our story?" );

        String SuperHero = scanner.nextLine();

        System.out.println("What is their superpower? ");

        String SuperPower = scanner.nextLine();

        System.out.println("Here is the story: " + "\n" + "There once was a superhero named " + SuperHero + " who had the power of " + SuperPower + "." + "\n" + "As they grew older, " + SuperHero + " saw that the world needed them." + "\n" + SuperHero + " used their ability to " + SuperPower + " to save the world." );
    }
}
