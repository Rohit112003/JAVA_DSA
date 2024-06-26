package OOP.inheritance;

public class main {
    public static void main(String[] args) {
//        Box box = new Box(4,5,6);
//        Box box2 = new Box(box);
//        System.out.println(box.l+" "+ box.h + " "+ box.w);
//        System.out.println(box2.l+" "+ box2.h + " "+ box2.w);
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box4.w);
//        System.out.println(box3.h + " "+ box3.weight);

//        Box boxe5 = new BoxWeight(2,3,4,5);
//        System.out.println(boxe5.w);
        //there are many  variables in both parent and child classes
        //you are given access to variables that are in the ref type BoxWeight
        //hence , you should have access to wegt variable
        //this also means,  that the ones you are trying to access should be initialsed
        //but here, when the obj itself is of type parent class,  how will you calll the constructor of child class

//        BoxWeight box6 = new Box(2,3,4,5);//erros because the box doesn't know about the downward class or varaiables
        //so you cannot have child reference variable and parent object

        BoxPrice box = new BoxPrice(5,8,200);
    }
}
