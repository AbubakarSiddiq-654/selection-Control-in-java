import java.util.Scanner;

public class Activity7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter two-digit year: ");
        int year = sc.nextInt();

        // Check magic date condition
        if (month * day == year) {
            System.out.println("The date " + month + "/" + day + "/" + year + " is MAGIC!");
        } else {
            System.out.println("The date " + month + "/" + day + "/" + year + " is NOT magic.");
        }

        sc.close();
    }
}
