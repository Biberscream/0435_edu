public class Main {

    public static void main(String[] args) {
        int min=23;
        String s;
        if(min>=0&&min<15) s="Первая четверть";
        else if(min>=15&&min<30) s="Вторая четверть";
        else if(min>=30&&min<45) s="Третья четверть";
        else if(min>=45&&min<60) s="Четвертая четверть";
        else s="Число за пределами диапазона 0-59";
        System.out.println(s);

    }
}
