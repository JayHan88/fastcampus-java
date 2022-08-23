package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge;

        if (age < 8 ) {
            System.out.println("미취학 아동입니다.");
            charge = 1000;
        } else if (age < 14) {
            System.out.println("초등학생입니다.");
            charge = 2000;
        } else if (age < 20) {
            System.out.println("중고등학생입니다.");
            charge = 3000;
        } else {
            System.out.println("일반인입니다.");
            charge = 4000;
        }

        System.out.println("입장료는 " + charge + "입니다.");
    }
}
