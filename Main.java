import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean isEvenLength = stringEvenOdd(inputString);
        System.out.println("String has even number of character: " + isEvenLength);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = leapYear(year);
        System.out.println("Is it a leap year? " + isLeapYear);

        scanner.close();
    }
    public static boolean stringEvenOdd(String str) {
        return str.length() % 2 == 0;
    }
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
