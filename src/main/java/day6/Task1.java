package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla");
        car.setColor("white");
        car.setAge(2020);
        car.info();
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getAge());
        System.out.println(car.yearDifference(2021));
        Motorbike motorbike = new Motorbike("Yamaha","Green",2015);
        motorbike.info();
        System.out.println(motorbike.getModel()+" "+motorbike.getColor()+" "+motorbike.getAge());
        System.out.println(motorbike.yearDifference(2020));
    }
}
