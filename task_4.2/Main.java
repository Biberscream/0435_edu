public class Main {
    /* Задача 4.2
    Написать функцию, которая возвращает минимум из трёх чисел. */
    public static void main(String[] args) {
        System.out.println(min(156, 675, 4));
    }
    static int min (int a, int b, int c) {
        if (a > b) return b;
        else if (a > c) return c;
        else return a;
    }
}
