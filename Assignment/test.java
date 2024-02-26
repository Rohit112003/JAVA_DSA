package Assignment;

public class test {
    public static void main(String[] args) {
        String colors = "aabaa";
        int neededTime[] = {1,2,3,4,1};
        int ans = minCost(colors,neededTime);
        System.out.println(ans);
    }
    public static int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int i =0;
        while(i<colors.length()-1){
            if(colors.charAt(i)==colors.charAt(i+1)){
                sum+=neededTime[i];
            }
            i++;
        }
        return sum;

    }
}
