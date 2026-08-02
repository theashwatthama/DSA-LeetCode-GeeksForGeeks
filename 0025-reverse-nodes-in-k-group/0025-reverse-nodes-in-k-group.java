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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = k;
        ListNode left=head;
        ListNode right;
        ListNode prevleft=null;
        ListNode res=null;

        while(true){
            right=left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }
            if(right!=null){
                ListNode next=right.next;
                reverse(left,size);
                if(prevleft!=null){
                    prevleft.next=right;
                }
                prevleft=left;
                if(res==null){
                    res=right;
                }
                left=next;
            } else {
                if(prevleft!=null){
                    prevleft.next=left;
                }
                if(res==null)
                    res=left;
                    break;
            }
        }
        return res;
    }

    public void reverse(ListNode head,int times){
        ListNode curr=head;
        ListNode prev=null;
        while(times-->0){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
    }
}