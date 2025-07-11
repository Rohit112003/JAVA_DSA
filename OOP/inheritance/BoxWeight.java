package OOP.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h ,  double w, double weight){
        super(l,w,h);//what is this? call the parent class constructor
        //use to initalise values present in parent class
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

}
