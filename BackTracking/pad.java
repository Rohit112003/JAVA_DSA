package BackTracking;

public class pad {
    public static void main(String[] args) {
        mobilepad("","12");
    }
    static  void mobilepad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0);
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a'+ i);
            mobilepad(p+ch, up.substring(1));
        }
    }
}
