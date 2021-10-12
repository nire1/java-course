package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int a = Scan.nextInt();
        int b = Scan.nextInt();
            a=a+1;
        while(a<b){

            if (a % 5 == 0 && a % 10 != 0)
                System.out.print(a + " ");
            a++;
        }

}
}
