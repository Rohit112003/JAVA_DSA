package TCS;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int array[] = {4,3,5,2,1,9};
        int ans=  findSecondSmallest(array);
        System.out.println(ans);
        int ans2 = findSecondLarget(array);
        System.out.println(ans2);
    }

    private static int findSecondSmallest(int[] array) {
        int min= Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        for(int i =0; i<array.length; i++){
            if(array[i]<secondMin && array[i]!=min){
                secondMin = array[i];
            }
        }
        return secondMin;
    }

    private static int findSecondLarget(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        for(int i =0; i<array.length; i++){
            if(array[i]>secondMax && max!=array[i]){
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}
