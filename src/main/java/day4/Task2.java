package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[100];
        int min =10000;
        int max = 0;
        int count0=0;
        int sum = 0;
        for (int i = 0;i<array.length;i++){
            array[i] = random.nextInt(10000);
        }
        for(int num:array){
            if (num>max ){
                max = num;
            }if(num<min){
                min = num;
            }
            if(num%10==0){
                count0 ++;
                sum=sum+num;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println("количество элементов массива, оканчивающихся на 0: "+ count0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: "+ sum);
    }
}
