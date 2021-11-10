package day14;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("inputfile");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }

            int maxCountOfFile = 0;

            for (String number : numbers) {
                maxCountOfFile += Integer.parseInt(number);
            }


            System.out.println(maxCountOfFile);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


    }
}
