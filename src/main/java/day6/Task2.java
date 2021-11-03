package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2015,30,60);
        airplane.setYear(2013);
        airplane.setLength(45);
        airplane.fillUp(100);
        airplane.fillUp(150);
        airplane.info();

    }
}
