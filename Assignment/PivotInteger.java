package Assignment;

public class PivotInteger {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
    public static int pivotInteger(int n) {
        int sum = 0;
        for(int i  = 1 ; i<= n; i++){
            sum +=i;
        }
        int pivot = n;
        int newSum = 0;
        while(pivot>0){
            if(sum-pivot == newSum){
                return pivot;
            }

            newSum+=pivot;
            sum-=pivot;

            pivot=  pivot-1;

        }
        return -1;

    }
}
