package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithK {
    public static void main(String[] args) {
        String s ="aabacbebebe";
        int k= 3;
        int ans = LongestSubsK(s,k);
        System.out.println(ans);
    }

    private static int LongestSubsK(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
//        char[] ch = s.toCharArray();
        int j =0;
        int i =0;
        int max =-1;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

            if(map.size()<k){
                j++;
            }else if(map.size()==k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    if(map.get(s.charAt(i))>0){
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                        if(map.get(s.charAt(i))==0){
                            map.remove(s.charAt(i));
                        }
                        i++;
                    }


                }
                j++;
            }


        }
        return max;
    }
}
