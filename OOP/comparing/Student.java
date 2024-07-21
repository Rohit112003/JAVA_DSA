package OOP.comparing;

public class Student implements Comparable<Student> {
    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    int roll;

    @Override
    public String toString() {
        return marks+"";
    }

    float marks;


    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
