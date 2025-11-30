import java.util.Scanner;

public class Activity10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter the number of books purchased this month: ");
        int books = sc.nextInt();

        int points;

        // Determine points based on books purchased
        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else { // 4 or more
            points = 60;
        }

        // Output result
        System.out.println("You have earned " + points + " points this month.");

        sc.close();
    }
}
