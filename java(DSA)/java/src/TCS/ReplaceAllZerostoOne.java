package TCS;

public class ReplaceAllZerostoOne {
    public static void main(String[] args) {
        int n =102003;
        String temp = n+ "";

        int ans = replaceZeros(temp);
        System.out.println(ans);
    }

    private static int replaceZeros(String temp) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<temp.length(); i++){
            if(temp.charAt(i)=='0'){
                sb.append("1");
           }else{
                sb.append(temp.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
