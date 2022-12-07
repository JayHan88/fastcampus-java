package ch17;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Jay");

        System.out.println(employee1.getName() + "님의 사번 : " + employee1.getId());

        Employee employee2 = new Employee();

        employee2.setName("Tom");

        System.out.println(employee2.getName() + "님의 사번 : " + employee2.getId());

        System.out.println(Employee.getSerialNum());

    }
}
