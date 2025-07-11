package OOP.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Kunal= new Student(12,89.76f);
        Student Rahul = new Student(5,99.52f);
        Student Arpit = new Student(5,91.52f);
        Student Karan = new Student(5,77.52f);
        Student Sachin = new Student(5,84.52f);

        Student list[] = {Kunal,Arpit,Rahul,Karan,Sachin};
//        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        Arrays.sort(list,(o1,o2)->-(int)(o1.marks-o2.marks));


        if(Kunal.compareTo(Rahul)<0){
            System.out.println("Rahul has more marks");
        }
    }
}
