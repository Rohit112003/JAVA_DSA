package ust.oops;

public class Box {
    double h;
    double w;
    double l;

    Box(){
        this.h = -1;
        this.w=-1;
        this.l = -1;
    }
    Box(int val){
        this.w=val;
        this.h = val;
        this.l = val;
    }
    Box(int l1,int l2, int l3){
        this.w=l1;
        this.h = l2;
        this.l = l3;
    }


}
