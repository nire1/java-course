package day9.Task1;

public class Teacher extends Human{
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }
    @Override

    void printInfo(){
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s\n",getName());
    }

    public String getSubjectName() {
        return subjectName;
    }
}
