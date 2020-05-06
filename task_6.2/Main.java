/*1. Создать public static класс Goose(Гусь).
2. Создать public static класс Dragon(Дракон).
3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].*/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Goose().getSize());
        System.out.println(new Dragon().getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize(){
            return ("Goose is small " + super.getSize());
        }
    }
    public static class Dragon extends BigAnimal {
        @Override
        public String getSize(){
            return ("Dragon is big " + super.getSize());
        }
    }    
}
