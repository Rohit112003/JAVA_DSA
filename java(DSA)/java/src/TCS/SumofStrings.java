package TCS;

public class SumofStrings {
    public static void main(String[] args) {
        String s = "1xyz123";
      int ans=  SumofString(s);
        System.out.println(ans);
    }

    private static int SumofString(String s) {
        int sum =0;
        String tempSum= "0";
        for(int i =0; i<s.length();i++){
            char y = s.charAt(i);
            if(Character.isDigit(y)){
                tempSum+=y;
            }else{
                sum+=Integer.parseInt(tempSum);
                tempSum="0";
            }
        }
        return sum+Integer.parseInt(tempSum);
    }
}
