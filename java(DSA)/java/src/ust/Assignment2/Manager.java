package ust.Assignment2;

public class Manager extends Member{
    public Manager(String name, int age, long phoneNumber, String address, double salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    String specialization;
    String department;
}
