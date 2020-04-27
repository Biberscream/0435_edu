import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*ЗЗапросить у пользователя ввод числа и сохранить это число в переменную a.
        Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.*/
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a == 10?"TRUE":"FALSE");
    }
}
