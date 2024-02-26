package Assignment;

public class q2 {
    public static void main(String[] args) {
        String x = "011011";
        String y = "011011";
        System.out.println(addBinary(x,y));
    }

    private static String addBinary(String x, String y) {
        int num1= Integer.parseInt(x,2);
        int nums2 = Integer.parseInt(y,2);

        int sum = num1+nums2;
        String result = Integer.toBinaryString(sum);
        return result;
    }


}
