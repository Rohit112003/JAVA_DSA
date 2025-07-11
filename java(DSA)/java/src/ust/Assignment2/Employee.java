package ust.Assignment2;

public class Employee extends Member{

    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
        this.department = department;
    }


    String specialization;
    String department;

//    public Employee(int name, int age, long phoneNumber, String address, double salary) {
//        super(name, age, phoneNumber, address, salary);
//    }


}
