package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");

        }
        System.out.println(sb);
        /*
        String s = "";
        for(int i = 0 ;i<=20000;i++){
            s = s + i + " ";
        }
        System.out.println(s);**/
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }


}
