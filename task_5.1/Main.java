public class Cat {
    public static void main(String[] args) {
        Katze cat = new Katze();
        cat.setName("Timmy");
    }
    static class Katze {
        private String name = "Timmy";
        public void setName(String name) {
            this.name = name;
            System.out.println(this.name);
        }
    }
}
