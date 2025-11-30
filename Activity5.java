import java.util.Scanner;

public class  Activity5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Check conditions
        if (a == b && b == c) {
            System.out.println(3); // all three equal
        } else if (a == b || a == c || b == c) {
            System.out.println(2); // two equal
        } else {
            System.out.println(0); // all different
        }

        sc.close();
    }
}
