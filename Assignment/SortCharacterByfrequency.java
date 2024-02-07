package Assignment;

import java.util.HashMap;
import java.util.Map;

public class SortCharacterByfrequency {
    public static void main(String[] args) {
        String s = "tree";
        String ans = checkCharacter(s);
        System.out.println(ans);
    }

    private static String checkCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        returnLength(map, sb);
        return sb.toString();
    }

    private static void returnLength(Map<Character, Integer> map, StringBuilder sb) {
        while (!map.isEmpty()) {
            int max = -1;
            char key = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            for (int i = 0; i < max; i++) {
                sb.append(key);
            }
            map.remove(key);
        }
    }
}
