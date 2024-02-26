package Assignment;

import java.util.Arrays;

public class CheckTemapratures {
    public static void main(String[] args) {
        int array [] = {73,74,75,71,69,72,76,73};
        dailyTemperatures(array);

    }
    public static void dailyTemperatures(int[] temperatures) {
        int[] array = new int[temperatures.length];
        for(int i =0;i<temperatures.length;i++){
            if(i==temperatures.length-1){
                array[i]=0;
            }
            int count = 0;
            for(int j =i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    count++;
                    array[i] = count;
                    break;
                }
                if(temperatures[i]>=temperatures[j]){
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(array));;
    }
}
