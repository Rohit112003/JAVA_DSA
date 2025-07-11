package ust.Assignment2;

public class Member {

    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;
    public Member(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Member salray "+ salary);
    }






}
