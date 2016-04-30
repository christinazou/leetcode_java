/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cur=head;
        int i=0;
        while(cur!=null){
          i++;
          cur=cur.next;
       }
       if (i>=2){
       int[] list= new int[i];
       cur=head;
       i=0;
       while(cur!=null)
       {
          list[i]=cur.val;
          i++;
          cur=cur.next;
       }
      
       for(i=0;i<=(list.length-1)/2;i++){
           if(list[i]!=list[list.length-1-i]){
               return false;
           }
       }}
       return true;
    }
}
