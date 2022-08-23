package ch14;

public class TakeTrainTest {

    public static void main(String[] args) {
        Student student1 = new Student("James", 5000);
        Student student2 = new Student("Tomas", 10000);

        Bus bus = new Bus(100, 0, 1000);
        Subway subway = new Subway(2, 0, 1200);

        student1.takeBus(bus);
        student2.takeBus(bus);
        student2.takeBus(bus);
        student2.takeSubway(subway);

        student1.showInfo();
        student2.showInfo();

        bus.showInfo();
        subway.showInfo();

    }
}
