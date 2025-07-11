package NormalQuestion;

public class grumpyBookstore {
    public static void main(String[] args) {
        int customers[] ={1,0,1,2,1,1,7,5};
        int grumpy[]= {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers,grumpy,minutes));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for(int i =0; i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
       int i =0;
        int j =0;
        int secondSum =0;
        int max =0;
        while(j<customers.length){
            if(grumpy[j]==1){
                secondSum+=customers[j];
            }
            if(j-i+1<minutes){
                j++;
            }
            else if(j-i+1==minutes){
                max =  Math.max(max,secondSum);
                j++;
            }else if(j-i+1>minutes){
                if(grumpy[i]==1){
                    secondSum-=customers[i];
                    i++;

                }else{
                    i++;

                }
                j++;
            }
        }
        return max;
    }
}
