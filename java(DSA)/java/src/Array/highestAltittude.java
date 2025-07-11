package Array;

public class highestAltittude {
    public static void main(String[] args) {
        int array[] = {-5,1,5,0,-7};
       int ans=  largestAltitude(array);
        System.out.println(ans);
    }
    public static int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        max = Math.max(max, 0);
        int i =0;
        for( i =1; i<gain.length;i++){
            sum+=gain[i-1];
            max = Math.max(sum,max);

        }
        if(i==gain.length){
            sum+=gain[gain.length-1];
            max =Math.max(max,sum);
        }
        return  max;

    }
}
