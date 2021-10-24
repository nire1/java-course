package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setAge(2019);
        lada.setColor("Gray");
        lada.setModel("Vesta");

        System.out.println(lada.getModel()+lada.getAge()+lada.getColor());
    }
}
