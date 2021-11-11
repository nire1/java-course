package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("C:\\Users\\denis\\Desktop\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        File fileOut = new File("C:\\Users\\denis\\Desktop\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");

        try {
            PrintWriter printWriter = new PrintWriter(fileOut);
            Scanner scanner = new Scanner(fileIn);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arrayLine = line.split(";");
                if (arrayLine.length > 3) {
                    throw new IllegalArgumentException();
                } else {

                    if (Integer.parseInt(arrayLine[2]) == 0) {

                        printWriter.print((arrayLine[0] + " " + arrayLine[1] + " " + arrayLine[2]) + " \n");

                    }
                }

            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл 2 не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("В файле стобцов больше 3");
        }


    }
}
