import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}

    /* А дальше надо написать код, который бы выполнял операции над массивом
       Идея заключается в том, что я хочу создать второй массив данных, 
       в который буду записывать счёт (count) последовательных цифр с проверкой на равенство
       После этого должен быть вывод результата
