package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петрович","история");
        Student student= new Student("Виталик");
        teacher.evaluate(student);
    }
}
