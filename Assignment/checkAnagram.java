package Assignment;
import java.util.HashMap;
public class checkAnagram {
    public static void main(String[] args) {
        String s = "rohit";
        String w = "tihor";
        boolean ans = checkAnagramVal(s, w);
        System.out.println(ans);
    }

    private static boolean checkAnagramVal(String s, String w) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < w.length(); j++) {
            if (map.containsKey(w.charAt(j))) {
                map.put(w.charAt(j), map.get(w.charAt(j)) - 1);
            }
        }

        for (Character key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}
