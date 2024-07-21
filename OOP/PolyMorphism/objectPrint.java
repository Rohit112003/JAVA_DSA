package OOP.PolyMorphism;

public class objectPrint {
    int num;
    objectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        return "objectprint{"+ "num=" + num+ "}";
    }

    public static void main(String[] args) {
        objectPrint obj = new objectPrint(54);
        System.out.println(obj);
    }
}
