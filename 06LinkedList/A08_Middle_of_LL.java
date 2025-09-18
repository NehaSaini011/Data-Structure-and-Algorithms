// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.

 
public class A08_Middle_of_LL {
    
//   Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        ListNode ptr = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }

        size = size/2;
        // if(size%2==0){
            for(int i = 0;i<size;i++){
                ptr = ptr.next;
            }
        // }
        // else if(size%2!=0){
            
        // }
        return ptr;
    }
}
}
