package Assignment;

public class q3 {

    public static void main(String[] args) {
        int n = 54321;
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        for(int i =0; i<arr.length; i++){
//            char ch = arr.charAt(i);
//            System.out.println(arr.charAt(i));
        }
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {

        int sum = 0;
        int k = 0;
        while(n>0){
            k = n%10;
            sum = sum*10+k;
            n=n/10;

        }
        return sum;
    }
}
