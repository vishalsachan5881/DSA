/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//1 2 3 4 5
      
class Solution {
    public ListNode middleNode(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
        while( fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next!=null)
            slow=slow.next;
        return slow;
       // int mid = (size%2==0)?size+1 : size 
    }
}