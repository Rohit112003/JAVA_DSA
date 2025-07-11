package Array;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {
    public static int MostSpecialNumber(int n,int[] arr){
        Arrays.sort(arr);
        int ans = -5;
        for(int i =0; i<n-1;i++){
            if(arr[i]<arr[i+1] || arr[i]==arr[i+1]){
                int val= checkFunction(arr[i],arr[i+1]);
                if(val==0){
                    ans = Math.max(ans, Math.max(arr[i],arr[i+1]));
                }else if(val>0){
                    ans = Math.max(ans,val);
                }else{
                    continue;
                }
            }
        }
        return ans;
    }
    public static int checkFunction(int a, int b){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int temp1=a;
        int temp2 =b;
        while(temp1>0){
            int val = temp1%10;
            set1.add(val);
            temp1=temp1/10;
        }
        while(temp2>0){
            int val = temp2%10;
            set2.add(val);
            temp2=temp2/10;
        }
        if(set1.size()==set2.size()){
            return 0;
        }
        if(set1.size()>set2.size()) return a;

        return -1;
    }

    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n;
//        n=scan.nextInt();
//        int[] arr = ;
//        for(int j=0;j<n;j++){
//            arr[j]=scan.nextInt();
//        }
        int result;
        int n =2;
        int arr[] = {33,12};
        result = MostSpecialNumber(n,arr);
        System.out.print(result);

    }
}