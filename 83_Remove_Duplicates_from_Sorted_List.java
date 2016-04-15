/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode headCount = new ListNode(0);
        headCount.next = head;
        ListNode next = head.next;
        while (head.next != null){
            if (head.val == next.val){
                next=next.next;
                head.next=next;
            }else{
                next=next.next;
                head=head.next;
        }
        }
        return headCount.next;
    }
}
