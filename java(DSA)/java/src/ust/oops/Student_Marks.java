package ust.oops;

public class Student_Marks extends Student_Details{
    int semester;
    int[] marks = new int[4];

    Student_Marks(String studentId, String name, String mobile, String email, String deptCode,
                  String teacherId, int semester, int[] marks) {
        super(studentId, name, mobile, email, deptCode, teacherId);
        this.semester = semester;
        this.marks = marks;
    }

    int totalMarks() {
        int total = 0;
        for (int mark : marks)
            total += mark;
        return total;
    }

    double averageMarks() {
        return totalMarks() / 4.0;
    }

    void display() {
        System.out.println("ID " + studentId + " Name " + name + " Total " + totalMarks()
                + " Average " + averageMarks());
    }
}
