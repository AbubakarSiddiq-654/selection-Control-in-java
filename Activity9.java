import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coins
        System.out.print("Enter number of pennies: ");
        int pennies = sc.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = sc.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = sc.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = sc.nextInt();

        // Calculate total value in cents
        int totalCents = pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25;

        // Compare with 100 cents (1 dollar)
        if (totalCents == 100) {
            System.out.println("Congratulations! You win the game — exactly one dollar!");
        } else if (totalCents < 100) {
            System.out.println("Sorry! The amount is less than one dollar.");
        } else {
            System.out.println("Sorry! The amount is more than one dollar.");
        }

        sc.close();
    }
}
