package ch04;

import java.time.LocalDateTime;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.studentId = 1234;
        student1.setStudentName("Lee");
        student1.address = "서울 강남구";

        student1.showStudentInfo();

        Student student2 = new Student();
        student2.studentId = 12343;
        student2.studentName = "Jay";
        student2.address = "서울 성동구";

        student2.showStudentInfo();

        System.out.println(LocalDateTime.now().minusMonths(3));

        System.out.println(LocalDateTime.now().minusDays(90));

    }
}
