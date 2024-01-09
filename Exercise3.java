import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a string (type ':q' to quit): ");
            String inputString = scanner.nextLine();

            if (":q".equals(inputString)) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            String[] characters = inputString.split("");

            System.out.println("Result: ");
            for (String character : characters) {
                System.out.println(character + ",");
            }
            System.out.println();
        }
        scanner.close();
    }
}
