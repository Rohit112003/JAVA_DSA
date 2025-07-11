package ust.oops;

public class CollegeSystem {
    public static void main(String[] args) {
        Student_Marks[] students = new Student_Marks[5];
        students[0] = new Student_Marks("S101", "Rohit", "9876543210", "amit@example.com", "CSE", "T1", 1, new int[]{80, 85, 78, 90});
        students[1] = new Student_Marks("S102", "Rohan", "9876543211", "bhavna@example.com", "ECE", "T2", 1, new int[]{70, 65, 75, 60});
        students[2] = new Student_Marks("S103", "Roshan", "9876543212", "chirag@example.com", "ME", "T3", 1, new int[]{88, 92, 79, 84});
        students[3] = new Student_Marks("S104", "Shubham", "9876543213", "deepa@example.com", "CSE", "T1", 1, new int[]{91, 89, 95, 94});
        students[4] = new Student_Marks("S105", "Subhankar", "9876543214", "esha@example.com", "IT", "T4", 1, new int[]{76, 85, 83, 79});
        for (Student_Marks student : students) {
            student.display();
        }

    }
}

