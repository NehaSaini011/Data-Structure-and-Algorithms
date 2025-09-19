// Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class A10_Remove_Nth_Node_from_End_of_List{    
//   Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        ListNode start = head;
        // ListNode remove = head;
        int size = 0;
        while(ptr!=null){
            size++;
            ptr=ptr.next;
            
        }
        if(size==n){
             return head.next;
        }
        size = size - n - 1;
        for(int i = 0;i<size;i++){
            start = start.next;
        }
        
        start.next = start.next.next;
        

        return head;
    }
}
}