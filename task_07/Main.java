import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int redius = scan.nextInt();
        double L = 2 * 3.14 * redius;
        System.out.print(L);
    }
}
