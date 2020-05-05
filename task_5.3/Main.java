public class Main {
    public static void main(String[] args) {
        //String text = null;
        Cat tim = new Cat("Tim", 6, 8, 10);
        Cat lada = new Cat("Lada", 8, 6, 10);
        if (tim.fight(lada)) System.out.println(tim.catsName + " has won!");
        else if (lada.fight(tim)) System.out.println(lada.catsName + " has won!");
        else System.out.println("No winners");
    }
}

        /*Задача 5.3
        /* /* Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого
больше "победивших" критериев.
         */
/* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */

public class Main {
    public static void main(String[] args) {
        //String text = null;
        Cat tim = new Cat("Tim", 6, 8, 10);
        Cat lada = new Cat("Lada", 8, 6, 10);
        if (tim.fight(lada)) System.out.println(tim.catsName + " has won!");
        else if (lada.fight(tim)) System.out.println(lada.catsName + " has won!");
        else System.out.println("No winners");
    }
}

        /*Задача 5.3
        /* /* Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого
больше "победивших" критериев.
         */
/* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */

//Класс Cat в среде разработки выделен в отдельный файл cat.java
public class Cat {
    public String catsName;
    public int age;
    public int weight;
    public int strength;

    public Cat(String catsName, int age, int weight, int strength){
        this.catsName = catsName;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat enemy) {
        int cat1 = 0;
        int cat2 = 0;
        if (this.age > enemy.age) cat1++;
        else if (this.age < enemy.age) cat2++;
        if (this.weight > enemy.weight) cat1++;
        else if (this.weight < enemy.weight) cat2++;
        if (this.strength > enemy.strength) cat1++;
        else if (this.strength < enemy.strength) cat2++;
        if (cat1>cat2) return true;
        else return false;
    }
}
