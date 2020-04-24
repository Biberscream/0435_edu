import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TC = scan.nextInt();
        int FT = (9 / 5) * TC +32;
        System.out.print(FT);
    }
}

// или

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TC;
        do {
            System.out.println("Please enter t°С: ");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
            TC = scan.nextInt();
        } while (TC <= 0);
        int TF = TC * (9 / 5)+32;
        System.out.println("Fahrenheit temperature is "+TF);
        System.out.println("Thank you");
    }
}
