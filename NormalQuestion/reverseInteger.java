package NormalQuestion;

public class reverseInteger {
    public static void main(String[] args) {
        int n = -321;
        System.out.println(reverseEasy(n));
    }

    private static int reverseEasy(int x) {
        StringBuilder sb = new StringBuilder();
        String str = ""+ x;
        for(int i =str.length()-1;i>=0;i--){
            if(str.charAt(i)==0 && sb.isEmpty()){
                continue;
            }
            if(str.charAt(i)=='-'){
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        if(x<0){
            sb.insert(0,'-');
        }
        String numericString = sb.toString();
        int number = Integer.parseInt(numericString);
        return number;
    }
}
