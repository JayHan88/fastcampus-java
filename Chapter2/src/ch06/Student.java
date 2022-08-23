package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {
        System.out.println("Student 기본 생성자를 통한 객체 생성");
    }

    public Student(int studentNumber, String studentName, int grade) {

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;

    }

    public String showStudentInfo() {

        return studentName + " 학생의 학번은 " + studentNumber + "이고, " + grade + "학년입니다.";
    }

}
