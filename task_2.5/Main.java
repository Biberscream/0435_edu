import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         /*Задание 2.5: Пользователь вводит сумму вклада и процент,
           который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        while (!scan.hasNextDouble()) {
            System.out.println("That's not a number!");
            scan.next();
        }
        double amount = scan.nextDouble();
        System.out.println(amount);
        System.out.println("Enter interest rate: ");
        while (!scan.hasNextDouble()) {
            System.out.println("That's not a number!");
            scan.next();
        }
        double IR = scan.nextDouble(); //IR - interest rate
        System.out.println("Interest rate is; " + IR);
        int Y = 5; // Y - количество лет вклада
        double P; // P - ежегодный доход по вкладу
        for (int i = 0; i < Y; i++) {
            P = (amount * IR) / 100;
            amount += Math.round(P);
            System.out.println ((i + 1) + " year amount: " + amount);
        }
    }
}
