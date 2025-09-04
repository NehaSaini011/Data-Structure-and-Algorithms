// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

// For example, the following two linked lists begin to intersect at node c1:

import java.util.*;
public class A03_Intersection_of_two_ll {
    
//   Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            if(a == null){
                a = headB;
            }else{
                a = a.next;
            }
            if(b == null){
                b = headA;
            }else{
                b = b.next;
            }
        }
        return a;
    }
}
}
