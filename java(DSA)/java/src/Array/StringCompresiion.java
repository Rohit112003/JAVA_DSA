package Array;

public class StringCompresiion {
    public static void main(String[] args) {
        char chars[] = {'a','a','a','b','b','a','a'};
        System.out.println(compress(chars));
    }
    public static String compress(char[] chars) {
        int count =0;
        boolean array[] = new boolean[chars.length];
        for(int i =0; i<array.length; i++){
            array[i] = false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<chars.length ; i++){
            if(array[i]==true){
                continue;
            }else{
                for(int j=i; j<chars.length; j++){
                    if(chars[i]==chars[j]){
                        array[j]=true;
                        count++;
                    }else if(chars[i]!=chars[j]){
                        break;
                    }
                }
                if(count==1){
                    sb.append(chars[i]);
                    count=0;
                }else{
                    sb.append(chars[i]).append(count);
                    count=0;
                }
            }

        }
        return sb.toString();
    }
}
