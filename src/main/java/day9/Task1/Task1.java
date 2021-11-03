package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Вася", "md56");
        Teacher teacher = new Teacher("Анатолий Онотолич", "история");

        System.out.println(student.getGroupName() + " " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
