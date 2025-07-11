package slidingWindow;

public class MaximumSize {
    public static void main(String[] args) {
        int array[] = {2,5,1,8,2,9,1};
        int k =3;
        System.out.println( maximumSize(array,k));
    }

    private static int maximumSize(int[] array, int k) {
        int i =0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(j<array.length){
            sum+=array[j];
            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                max=Math.max(sum,max);
                sum-=array[i];
                i++;
                j++;
            }
//            else if (j-i+1>k) {
//                sum-=array[i];
//                max=Math.max(sum,max);
//                i++;
//                j++;
//            }
        }
        return max;
    }
}
