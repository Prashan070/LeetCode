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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
     ListNode dummy = new ListNode(0);
     dummy.next=head;
     ListNode slow=head;
     ListNode fast=head;
  
  if(head==null || head.next==null){
    return null;
  }


while(fast != null && fast.next!=null ){
     dummy=dummy.next;
     slow= slow.next;
     fast=fast.next.next;
}
dummy.next=slow.next;

return head;


    }
}