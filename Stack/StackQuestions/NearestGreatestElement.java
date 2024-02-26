package Stack.StackQuestions;
import java.util.*;
public class NearestGreatestElement {
    public static void main(String[] args) {
       int [] nums1 = {4,1,2};
       int [] nums2 = {1,3,4,2};
       int ans[] = nextGreaterElement(nums1, nums2);
    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums2.length;
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            if(st.isEmpty())
            {
                list.add(-1);
            }
            else
            {
                while(!(st.isEmpty()) && st.peek() <= nums2[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    list.add(-1);
                }
                else
                {
                    list.add(st.peek());
                }
            }
            st.push(nums2[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
        int []arr = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++)
        {
            arr[i] = list.get(getIndex(nums1[i] , nums2));
        }
        return arr;
    }
    public static int getIndex(int num , int []arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }








}

