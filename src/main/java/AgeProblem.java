import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeProblem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            try {
                System.out.print("Enter Birth Year: ");
                int birthYear = scanner.nextInt();

                System.out.print("Enter Birth Month (JAN-1, FEB-2, MAR-3...): ");
                int birthMonth = scanner.nextInt();

                System.out.print("Enter Current Year: ");
                int currentYear = scanner.nextInt();

                System.out.print("Enter Current Month (JAN-1, FEB-2, MAR-3...): ");
                int currentMonth = scanner.nextInt();

                if (birthMonth < 1 || birthMonth > 12 || currentMonth < 1 || currentMonth > 12) {
                    System.err.println("Invalid month. Month must be 1-12.");
                }
                else if (birthYear > currentYear) {
                    System.err.println("Invalid year. Birth year cannot be after current year.");
                }
                else {
                    int age = currentYear - birthYear;

                    if (currentMonth < birthMonth) {
                        age--;
                    }

                    System.out.println("Age: " + age);

                    System.out.print("CONTINUE(Y/N)? ");
                    String answer = scanner.next();

                    if (answer.equalsIgnoreCase("N")) {
                        running = false;
                    }
                }

            } catch (InputMismatchException ime) {
                System.err.println("Invalid input. Please enter numbers only.");
                scanner.nextLine();
            }
        }

        System.out.println("Program ended.");
    }
}