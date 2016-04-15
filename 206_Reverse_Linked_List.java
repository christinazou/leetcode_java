//Reverse a singly linked list.
//Hint:
//A linked list can be reversed either iteratively or recursively. Could you implement both?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //My solution
 // iterative solution
public class Solution {
    public ListNode reverseList(ListNode head) {
            ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
    }
}

// recursive solution
public ListNode reverseList(ListNode head) {
    return reverseListInt(head, null);
}

public ListNode reverseListInt(ListNode head, ListNode newHead) {
    if(head == null)
        return newHead;
    ListNode next = head.next;
    head.next = newHead;
    return reverseListInt(next, head);
}


//another recursive solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;
    }
}

//another recursive solution
//and its cleanup version
public class Solution {
    public ListNode reverseList(ListNode curr){
        if(curr==null) return curr;
        ListNode rest = curr.next;
        if(rest==null) return curr;
        rest = reverseList(rest);
        curr.next.next = curr;    //  Here is the trick
        curr.next =null;          //
        return rest;
    }
}

   public class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            } else {
                ListNode next = head.next;
                next = reverseList(next);

                head.next.next = head;
                head.next = null;

                return next;   
            }
        }
    }


