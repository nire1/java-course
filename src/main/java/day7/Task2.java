package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 90;
        int max = 100;




        Player p1 = new Player((int) Math.random() * (max - min) + min);
        Player p2 = new Player((int) Math.random() * (max - min) + min) ;
        Player p3 = new Player((int) Math.random() * (max - min) + min);
        Player.info();
        Player p4 = new Player((int) Math.random() * (max - min) + min);
        Player p5 = new Player((int) Math.random() * (max - min) + min);
        Player p6 = new Player((int) Math.random() * (max - min) + min);
        Player.info();

        Player p7 = new Player((int) Math.random() * (max - min) + min);
        Player.info();
        System.out.println(Player.getCountPlayers());
        while (p1.getStamina() > 0) {
            p1.run();
            System.out.println(p1.getStamina());
        }
        Player.info();



    }
}
