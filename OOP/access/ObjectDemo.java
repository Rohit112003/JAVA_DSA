package OOP.access;

public class ObjectDemo {
    int num ;

    ObjectDemo(int num){
        this.num = num;
    }
//we will go in details how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);

        //unique representation of an object via a number
        //it's not address of the object it's just a random number but unique
        System.out.println(obj.hashCode());
    }
}
