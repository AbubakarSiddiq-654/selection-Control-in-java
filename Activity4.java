import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (a) Minimum of two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int minTwo = (num1 < num2) ? num1 : num2;
        System.out.println("Minimum of two numbers: " + minTwo);

        // (b) Again minimum of two numbers (same as above, repeated)
        System.out.print("Enter first number again: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number again: ");
        int n2 = sc.nextInt();

        int minTwoAgain = (n1 < n2) ? n1 : n2;
        System.out.println("Minimum of two numbers (again): " + minTwoAgain);

        // (c) Sign function
        System.out.print("Enter a number for sign check: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("Sign: 1 (positive)");
        } else if (x < 0) {
            System.out.println("Sign: -1 (negative)");
        } else {
            System.out.println("Sign: 0 (zero)");
        }

        // (d) Minimum of three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int minThree = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Minimum of three numbers: " + minThree);

        sc.close();
    }
}
