package CswSearching;

public class hcf {
    public static void main(String[] args) {
        int m = 10;
        int n = 3;
        int hcf = 0;
        for(int i = 1; i<=m || i<=n ; i++ ){
            if( m%i == 0 && n%i == 0 ){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
