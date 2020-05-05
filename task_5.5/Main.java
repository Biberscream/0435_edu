/* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...*/
public class Main {
    public static void main(String[] args) {
        Human grandpa = new Human("Evgeniy", false, 80, null, null);
        Human grandma = new Human("Alexandra", true, 75, null, null);
        Human grandpa2 = new Human("Juriy", false, 80, null, null);
        Human grandma2 = new Human("Svetlana", true, 78, null, null);
        Human michael = new Human("Michael", false, 57, grandpa2, grandma2);
        Human svetlana = new Human("Svetlana", true, 55, grandpa, grandma);
        Human evgenia = new Human("Evgenia", true, 35, michael, svetlana);
        Human albert = new Human("Albert", false, 28, michael, svetlana);
        Human artem = new Human("Artem", false, 11, null, evgenia);
        Human mikle = new Human("Mikle", false, 25, michael, svetlana);

        //albert.getInfo();
        grandpa.getInfo2();
        grandma.getInfo2();
        grandpa2.getInfo2();
        grandma2.getInfo2();
        michael.getInfo2();
        svetlana.getInfo2();
        evgenia.getInfo2();
        albert.getInfo2();
        artem.getInfo2();
        mikle.getInfo2();
    }
}

// класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human);
// Весь класс Human записан в отдельной вкладке
public class Human {
    String name;
    boolean gender;
    int age;
    Human father;
    Human mother;

    Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getInfo() {
        String info = "";
        info += "Info about " + this.name;
        info += ": " + (this.gender ? "female;" : "male");
        info += ", " + this.age + " years old";

        if (this.father != null) {
            info += ", " + "father: " + this.father.name;
        }

        if (this.mother != null) {
            info += ", " + "mother: " + this.mother.name + ".";
        }

        return info;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public void getInfo2() {
        System.out.println(getInfo());
    }

}
