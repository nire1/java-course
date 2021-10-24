package day5;

public class MOTORBIKE {
    String model;
    String color;
    int age;

    public MOTORBIKE(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
}
