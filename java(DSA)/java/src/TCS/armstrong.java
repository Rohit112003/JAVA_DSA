package TCS;

public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int s = n;
        int sum = 0;
        while(s>0){
            int temp = s%10;
            sum+=  Math.pow(temp,3);
            s =s/10;
        }
        if(sum==n){
            System.out.println(true +  " " + sum);
        }else{
            System.out.println(false+ " "+ sum);
        }
    }
}
