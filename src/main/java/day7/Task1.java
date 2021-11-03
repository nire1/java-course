package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boeing",2020,100,180);
        Airplane airplaneTwo = new Airplane("Sukhoy",2019,80,220);
        Airplane.compareAirplanes(airplaneOne,airplaneTwo);
    }
}