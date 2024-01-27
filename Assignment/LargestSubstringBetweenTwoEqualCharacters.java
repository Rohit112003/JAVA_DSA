package Assignment;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String s = "scayofdzca";
        int ans = maxLengthBetweenEqualCharacters(s);
        System.out.println(ans);

    }public  static  int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        boolean pres = false;
        int count=0;
        int max=-1;
        for(int i =0; i<n-1;i++){
            for(int j=i+1; j<n;j++){
                count++;
                if(s.charAt(i)==s.charAt(j)){
                    if(max<count){
                        max=count-1;
                    }
                    count=0;
                }
            }
        }
        return max;

    }

}
