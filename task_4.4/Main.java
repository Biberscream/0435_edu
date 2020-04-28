public class Main {
    /* Задача 4.4
    Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
    -----
    Подсказка: их 6 штук.
    Каждую комбинацию вывести с новой строки. Слова не разделять.
    ----------
    Пример:
    МылаРамуМама
    РамуМамаМыла
    ...  */
    public static void main(String[] args) {
        String a="Мама", b="Мыла", c="Раму";
        combo(a,b,c);
        combo(c,a,b);
        combo(c,b,a);
        combo(a,c,b);
        combo(b,a,c);
        combo(b,c,a);
    }
    static void combo (String a, String b, String c){
        System.out.println(a+b+c);
    }
}
