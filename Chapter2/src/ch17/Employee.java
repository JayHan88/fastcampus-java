package ch17;

public class Employee {

    private static int serialNum = 1000;

    private int id;

    private String name;

    private String department;

    public Employee() {
        serialNum++;
        id = serialNum;
    }

    public static int getSerialNum() {

        return serialNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
