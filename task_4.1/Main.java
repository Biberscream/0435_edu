public class Main {
    /* Задача 4.1
    Написать функцию, которая возвращает минимум из двух чисел. */
    public static void main(String[] args) {
        System.out.println(min(5, 3));
    }
    static int min (int a, int b) {
        if (a>b) return b;
        else return a;
    }
}
