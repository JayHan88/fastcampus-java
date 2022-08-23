package ch09;

public class Student {

    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    Student (int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.subjectName = subjectName;
        korean.score = score;
    }

    public void setMathSubject(String subjectName, int score) {
        math.subjectName = subjectName;
        math.score = score;
    }

    public void showScore() {
        int total = korean.score + math.score;
        System.out.println(studentName + " 학생의 합산 성적은 " + total +"입니다");
    }

}
