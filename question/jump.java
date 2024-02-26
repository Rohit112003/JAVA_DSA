import java.util.LinkedList;
import java.util.Queue;
public class jump {
    public static void main(String[] args) {
        int[] array = {2,3,0,0,4};
        boolean ans = jumpgame(array);
        System.out.println(ans);
    }

    private static boolean jumpgame(int[] array) {
        Queue <Integer> newQueue = new LinkedList<>();
        for(int i = 0; i<array.length;i++){
            newQueue.add(array[i]);
        }
        while(!newQueue.isEmpty()){
            int val = newQueue.poll();
            int i = 1;
            if(val==0){
                return false;
            }
            while(i<=val){
                newQueue.poll();
                i++;
            }

        }
        return true;

    }
}
