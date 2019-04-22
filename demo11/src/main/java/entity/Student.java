package entity;

public class Student {
    private String rollNumber;
    private String name;

    public Student(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student() {
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
