package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people.txt");

        System.out.println(parseFileToObjList(file));
    }

    static List<Person> parseFileToObjList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Person> personArrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] persons = line.split(" ");

                if(Integer.parseInt(persons[1])<0)
                    throw new IllegalArgumentException();

                Person person = new Person(persons[0],Integer.parseInt(persons[1]));
                personArrayList.add(person);


            }
            return personArrayList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
