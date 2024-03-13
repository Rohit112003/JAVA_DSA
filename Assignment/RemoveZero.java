package Assignment;
import java.util.*;
public class RemoveZero {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(-3);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(1);
        list.next.next.next.next.next = new ListNode(4);

        ListNode result = removeZeroSumSublists(list);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }



    public static ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode newNode = new ListNode(0);
        ListNode temp1 = newNode;

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int sum = 0;
        int prev = 0;
        for(int i =0; i<list.size(); i++){

            if(i>0){
                prev = list.get(i);
            }
            if((sum - list.get(i))==0){
                list.remove(i);

            }
            sum += list.get(i);

        }

        for(int i= 0 ; i<list.size(); i++){
            ListNode check = new ListNode(list.get(i));
            temp1.next = check;

        }
        return newNode.next;




    }
}
