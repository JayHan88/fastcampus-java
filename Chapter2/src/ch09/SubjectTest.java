package ch09;

public class SubjectTest {

    public static void main(String[] args) {
        Student student1 = new Student(1234, "Han");

        student1.setKoreanSubject("국어", 30);
        student1.setMathSubject("수학", 70);

        student1.showScore();

    }
}
