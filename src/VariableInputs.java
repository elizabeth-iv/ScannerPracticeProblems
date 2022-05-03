import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double: ");
        double DoubleValue = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value: ");
        boolean BooleanValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + text + "\n" + "Your integer is " + integer + "\n" + "Your double is " + DoubleValue + "\n" + "Your Boolean is " + BooleanValue);

    }
}
