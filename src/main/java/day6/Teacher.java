package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private  String subject;
    Random random = new Random();
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student s){

        int min = 2;
        int max = 5;
        int diff = max - min;
        String ratingString = null;
        int generate = random.nextInt(diff + 1) + min;
        switch (generate){
            case 2:
                ratingString = "неудовлетворительно";
                break;
            case 3:
                ratingString = "удовлетворительно";
                break;
            case 4:
                ratingString = "хорошо";
                break;
            case 5:
                ratingString = "отлично";
                break;
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",getName(),s.getName(),getSubject(),ratingString);
    }

    public String getName() {
        return name;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
