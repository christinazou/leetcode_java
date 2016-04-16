/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k!=0&&head!=null){
            ListNode slow=head;
            ListNode fast=head;
            int l=1;
            while(fast!=null&&fast.next!=null){
                 fast=fast.next;
                 l++;
            }
            fast.next=head;
            fast=head;

            for(int i=0;i<k%l+1;i++){
                fast=fast.next;
              }
              while(fast!=head){
                  fast=fast.next;
                  slow=slow.next;
              }
              head=slow.next;
              slow.next=null;
            }
        return   head;
    }
}
