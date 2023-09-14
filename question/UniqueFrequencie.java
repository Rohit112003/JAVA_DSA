import java.util.HashSet;

public class UniqueFrequencie {
    public static void main(String[] args) {
        String s = "aaabbbcc";
        int[] freq = new int[26];
        HashSet<Integer> set   = new HashSet<>();
        int deletion = 0;

        for(char c :s.toCharArray()){
            freq[c-'a']++;
        }
        for(int count: freq){
            while(count>0 && set.contains(count)){
                deletion++;
                count--;

            }

                set.add(count);

        }
        System.out.println(deletion);


    }
}
