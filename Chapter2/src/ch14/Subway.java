package ch14;

public class Subway {

    int subwayNumber;
    int revenue;
    int fee;
    int passCount;

    public Subway(int subwayNumber, int revenue, int fee) {
        this.subwayNumber = subwayNumber;
        this.revenue = revenue;
        this.fee = fee;
    }

    public void take(int fee) {
        this.revenue += fee;
        this.passCount++;
    }

    public void showInfo() {
        System.out.println(subwayNumber + "호선의 승객은 " + passCount + "명이고, 현재 수입은 " + revenue + "원 입니다.");
    }
}
