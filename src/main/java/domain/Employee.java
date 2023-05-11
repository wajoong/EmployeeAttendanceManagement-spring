package domain;

public class Employee {
    private long id;
    private int staffNumber;
    private String name;

    public Employee() {
    }

    public Employee(int staffNumber, String name) {
        this.staffNumber = staffNumber;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
