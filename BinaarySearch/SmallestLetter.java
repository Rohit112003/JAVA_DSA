package BinaarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'd';
        char ans = smallest(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    private static char smallest(char[] arr, char target, int start, int end) {
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                start =mid+1;
            }else{
                end=end-1;
            }
            if(start==arr.length){
                return arr[0];
            }

        }
        return arr[start];
    }
}
