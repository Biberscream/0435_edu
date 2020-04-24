public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        System.out.println(c + d);
    }

}

// Или

public class Main {

    public static void main(String[] args) {
        Integer a = 4;
        Integer b = 7;
        System.out.print(a.toString() + b.toString());
    }

}
