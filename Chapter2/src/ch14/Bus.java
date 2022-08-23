package ch14;

public class Bus {

    int busNumber;
    int revenue;
    int fee;
    int passCount;

    public Bus(int busNumber, int revenue, int fee) {
        this.busNumber = busNumber;
        this.revenue = revenue;
        this.fee = fee;
    }

    public void take(int fee) {
        this.revenue += fee;
        this.passCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passCount + "명이고, 현재 수입은 " + revenue + "원 입니다." );
    }
}
