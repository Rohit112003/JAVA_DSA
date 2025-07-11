package ust.Assignment2;

public class EmployeeClass {
    public static void main(String[] args) {
        Employee emp = new Employee("Rohit", 22,123456789,"iter",35000,"java","sde-1");
        Member mang = new Manager("Rohan", 22,123456789,"iter",45000,"java","sde-1");
        emp.printSalary();
        mang.printSalary();
    }
}
