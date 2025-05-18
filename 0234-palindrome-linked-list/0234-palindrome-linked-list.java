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
    public boolean isPalindrome(ListNode head) {
        ListNode ss = head;

        if(head==null || head.next ==null) return true;

        ListNode mid = middle(head);
        ListNode rev = reverse(mid); 

        while(rev != null){
            if(ss.val != rev.val){
                return false;
            }
            ss=ss.next;
            rev=rev.next;
        }
        return true;
    }

    ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    ListNode reverse(ListNode mid){
        ListNode prev =null;
        ListNode curr = mid;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}