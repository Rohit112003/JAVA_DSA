package Array;

public class flowerbed {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1};
        int n =1;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] arr, int n) {
        for(int i =1; i<arr.length-1; i++){
            if(n==0){
                return true;
            }

            if(arr[i-1]==0 && arr[i+1]==0 && !(arr[i] ==1)){
                arr[i]=1;
                n--;
            }
        }
        if(n>=1) return false;
        return false;
    }
}
