/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
ListNode dummy= new ListNode(0);
dummy.next=l1;
ListNode p=l1;
l1=dummy;

while(p!=null&&l2!=null)
{if(l2.val>p.val)
{l1=p;
p=p.next;
}
else{
l1.next=l2;
l1=l2;
l2=l2.next;
l1.next=p;
}
}
if(l2!=null){
    l1.next=l2;}

return dummy.next;
        
    }
}
