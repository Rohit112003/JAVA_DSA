package Assignment;
import java.util.*;
public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);

    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < ransomNote.length();i++){
            if(map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))+1);
            }else{
                map.put(ransomNote.charAt(i), 1);
            }
        }
        for(int i = 0; i < magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))-1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>0){
                return false;
            }

        }
        return true;

    }
}
