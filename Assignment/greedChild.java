package Assignment;

import java.util.Arrays;

public class greedChild {
    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[] ={3};
       int ans =  findContentChildren(g,s);
        System.out.println(ans);
    }
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int m =0;
//        Arrays.sort(g);
//        System.out.println(Arrays.toString(g));
//        Arrays.sort(s);

        for(int i = 0; i<g.length; i++){
//            if(j<s.length){
//                if(s[j]>=g[i]){
//                    count++;
//                    j++;
//                }else{
//                    j++;
//                }
//            }
            for(int j =0; j<s.length;j++){
                if(s[j]==g[i]){
                    count++;
                    break;
                }
            }
        }
        return count;

    }
}
