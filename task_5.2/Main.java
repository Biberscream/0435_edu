public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Timmy", 5, 10, 30);
        System.out.println(cat.name + " have " + cat.strenght + " power ");
    }
}
//когда делал задание, у меня в отдельной вкладке с именем Cat был класс Cat по аналогии с классом Human из вашего видеоурока
public class Cat {
    String name;
    int age;
    int weight;
    int strenght;

    Cat(String name, int age, int weight, int strenght) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strenght = strenght;
    }
}
