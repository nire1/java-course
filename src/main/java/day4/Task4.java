package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int index = 0;

        for (int i = 0; i <= array.length - 3; i++) {
            int count = 0;

            count = array[i] + array[i + 1] + array[i + 2];
            if (count > max) {

                max = count;
                index = i;

            }


        }

        System.out.println(max);

        System.out.println(index);

    }
}



