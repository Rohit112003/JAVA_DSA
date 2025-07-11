package ust.oops;

public class BoxWeight extends  Box{
    int weight;


    public BoxWeight(int l1, int l2, int l3, int weight) {
//        super(l1, l2, l3);
        this.w= l1;
        this.h = l2;
        this.l = l3;
        this.weight = weight;
    }

    BoxWeight(){
        this.weight =-1;
    }
    BoxWeight(int weight){
        this.weight = weight;
    }
}
