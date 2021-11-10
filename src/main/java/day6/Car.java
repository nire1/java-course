package day6;

public class Car {
    private String model;
    private String color;
    private int age;

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {

        return Math.abs(inputYear-age);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
