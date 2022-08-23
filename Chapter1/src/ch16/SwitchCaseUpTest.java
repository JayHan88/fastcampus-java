package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day = switch (month) {
            case 1, 3, 5, 7, 9, 11 -> {
                System.out.println("이번 달은 31일까지입니다.");
                yield 31;
            }
            case 2 -> {
                System.out.println("이번달은 28일까지입니다.");
                yield 28;
            }
            case 4, 6, 8, 10, 12 -> {
                System.out.println("이번달은 30일까지입니다");
                yield 30;
            }
            default -> {
                System.out.println("존재하지 앖는 달입니다.");
                yield -1;
            }
        };

        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
