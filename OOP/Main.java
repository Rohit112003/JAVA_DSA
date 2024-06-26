package OOP;



public class Main {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 30;
        swap(a,b);
        System.out.println(a +" " + b );


         Student kunal = new Student();
        System.out.println(kunal);
//        kunal.rno=44;
//        kunal.name="Kunal kushwaha";
//        kunal.marks=88.5f;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        A Rohit = new A("Rohit Kumar");
        //when a non primitive is final ,  you cannot reassign it
        Rohit.name = "Other name";
    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a= b;
        b=a;
    }


}
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by oobject
    //we need one word to acess every object

//    Student(){
//        this.rno = 13;
//        this.name= "Rohit Kumar";
//        this.marks = 88.5f;
//    }

    Student(){
        //this is how you
        // call a constructor from another constructor
        this(13,"Rohit",100);
    }

    //Student arpit = new Student(17,"Arpit", 89.7f);
    //herer ,  this woll be replaced with arpit
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

class A {
    final int num = 10;
    String name ;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
