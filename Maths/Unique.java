package Maths;

public class Unique {
    public static void main(String[] args) {
        int[] n = {2,3,2,3,4,4,6};
        System.out.println(check(n));
    }

    private static int check(int[] n) {
        int unique = 0;
        for(int arr:n){
            unique^=arr;
        }
        return unique;
    }
}
