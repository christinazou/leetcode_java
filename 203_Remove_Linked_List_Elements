/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head!=null){
            ListNode headCount = new ListNode(0);
            headCount.next= head;
            ListNode pre= headCount;
            while(pre.next!=null){
                if(head.val==val){
                    pre.next=pre.next.next;
                    head=pre.next;
                }else{
                    pre=pre.next;
                    head=head.next;
                }
                
            }
          return headCount.next;  
        }
        return null;
    }
}
