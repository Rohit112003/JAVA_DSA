package TCS;

public class NonNegativeInteger {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 15;
        allIntegersWithSameValue(n1, n2);
    }

    private static void allIntegersWithSameValue(int n1, int n2) {
        int count = 0;

        for (int i = n1; i <= n2; i++) {
            String temp = String.valueOf(i);
            boolean isUniform = true;

            for (int j = 1; j < temp.length(); j++) {
                if (temp.charAt(j) != temp.charAt(0)) {
                    isUniform = false;
                    break;
                }
            }

            if (isUniform) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total Count: " + count);
    }
}
