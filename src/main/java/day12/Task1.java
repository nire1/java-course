package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List <String>cars = new ArrayList<>(Arrays.asList("Toyota","BMW","LADA","Land Rover","Kia"));
        System.out.println(cars);
        cars.add(cars.size()/2,"Ford");
        cars.remove(0);
        System.out.println(cars);

    }
}
