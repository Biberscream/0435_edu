public class Main {
    /* Задача 4.3
    Написать функцию, которая возвращает минимум из четырёх чисел.
    Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b) (которую вы разработали в задаче 4.1). */
    public static void main(String[] args) {
        System.out.println(min3(5, 9, 8, 2));
    }
    static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }
    static int min2(int c, int d) {
        if (c > d) return d;
        else return c;
    }
    static int min3(int a, int b, int c, int d) {
        if (min(a, b) > min2(c, d)) return min2(c, d);
        else return min(a, b);
    }
}
