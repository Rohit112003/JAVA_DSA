package Recursion;

public class KthGrammar {
    public static void main(String[] args) {
        int n =30;
        int k = 434991989;
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        String ans = checkGrammar(0, n, k, sb).toString();
        for (int i = 0; i < ans.length(); i++) {
            if (i == k - 1) {
                System.out.println( ans.charAt(i) - '0');
            }
        }
        System.out.println(-1);
    }
    public static StringBuilder checkGrammar(int i, int n, int k, StringBuilder sb) {
        if (i == n) {
            return sb;
        }
        StringBuilder newSb = new StringBuilder();
        for (int j = 0; j < sb.length(); j++) {
            if (sb.charAt(j) == '0') {
                newSb.append("01");
            } else {
                newSb.append("10");
            }
        }
        return checkGrammar(i + 1, n, k, newSb);
    }
}
