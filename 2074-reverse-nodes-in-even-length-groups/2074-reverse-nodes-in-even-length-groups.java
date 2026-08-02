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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int groupSize=1;
        ListNode left=head;
        ListNode prevleft=null;
        
        while(left!=null){
            ListNode right=left;
            int count=1;
          while(count<groupSize && right.next!=null){
                right=right.next;
                count++;
            }
           ListNode nextGroup=right.next;
           if(count%2==0){
             right.next=null;
             ListNode newHead=reverse(left);
             if(prevleft==null){
                head=newHead;
             } else{
               prevleft.next=newHead;
             }
             left.next=nextGroup; 
             prevleft=left;
             
           } else{
            prevleft=right;
           } 
          left=nextGroup;
          groupSize++;     
    }
    return head;


    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
}