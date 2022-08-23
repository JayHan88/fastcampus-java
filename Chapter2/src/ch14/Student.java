package ch14;

public class Student {

    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(bus.fee);
        this.money -= bus.fee;
    }

    public void takeSubway(Subway subway) {
        subway.take(subway.fee);
        this.money -= subway.fee;
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
