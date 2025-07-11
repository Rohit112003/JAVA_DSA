package TCS;

public class leapyear {
    public static void main(String[] args) {
        int n = 2000;
        System.out.println(leapOrNot(n));
    }

    private static boolean leapOrNot(int n) {
        if(n%400==0){
            return true;
        }return false;
    }
}
