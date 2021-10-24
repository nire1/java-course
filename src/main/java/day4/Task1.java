package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        for(int x = 0; x<array.length; x++){
           array[x] = random.nextInt(10);
           if (array[x]>8) {
               a++;
           }if (array[x]==1){
               b++;
            }if (array[x]%2==0){
               c++;
            }else d++;
           sum = sum+array[x];

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+a);
        System.out.println("Количестве чисел равных 1: "+b);
        System.out.println("Количестве четных чисел: "+c);
        System.out.println("Количестве нечетных чисел: "+d);
        System.out.println("Сумме всех элементов массива: "+sum);
    }
}
