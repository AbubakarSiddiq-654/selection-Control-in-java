import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a number (1 - 10): ");
        int number = sc.nextInt();

        String roman;

        switch (number) {
            case 1: roman = "I"; break;
            case 2: roman = "II"; break;
            case 3: roman = "III"; break;
            case 4: roman = "IV"; break;
            case 5: roman = "V"; break;
            case 6: roman = "VI"; break;
            case 7: roman = "VII"; break;
            case 8: roman = "VIII"; break;
            case 9: roman = "IX"; break;
            case 10: roman = "X"; break;
            default: 
                roman = "Error! Number must be between 1 and 10.";
        }

        System.out.println("Roman Numeral: " + roman);

        sc.close();
    }
}
