// this solution create “first” and “ second” node in the loop. That is smart.

public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    while (current.next != null && current.next.next != null) {
        ListNode first = current.next;
        ListNode second = current.next.next;
        first.next = second.next;
        current.next = second;
        current.next.next = first;
        current = current.next.next;
    }
    return dummy.next;
}

// This is similar to my intuitive thought. However it doesn't use an dummy node.
public class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode cur = head, next1, next2;
            if(head == null) return null;
            if(head.next == null) return head;

            //head change with next is a special case, so we deal with it first
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = cur;
            head = temp;

            while(cur.next != null && cur.next.next != null) {
                next1 = cur.next;
                next2 = cur.next.next;
                swap(cur,next1,next2);
                cur = cur.next.next;
            }
            return head;
        }

        private void swap(ListNode cur, ListNode next1, ListNode next2) {
            cur.next = next2;
            next1.next = next2.next;
            next2.next = next1;
        }
    }
