import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int countdownNumber = scanner.nextInt();

        System.out.println("Countdown: ");
        for (int i = countdownNumber; i >= 0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
