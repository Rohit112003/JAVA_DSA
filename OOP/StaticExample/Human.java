package OOP.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
   static long population;

//so such properties that are not directly related to the object those are know
// as static variable known as static methods
    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
