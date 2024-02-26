package BinaarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target =15;
      int ans =   Ceiling(arr,0,arr.length-1, target);
        System.out.println(ans);
    }

    private static int Ceiling(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid =  (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return  Ceiling(arr, start, end-1,target);
            }else{
              return  Ceiling(arr,mid+1,end,target);
            }


        }
        return end;

    }
}
