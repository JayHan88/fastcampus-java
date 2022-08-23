package ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.grade = 1;

        System.out.println(student1.showStudentInfo());

        Student student2 = new Student(1234, "Han", 3);

        System.out.println(student2.showStudentInfo());
    }
}
