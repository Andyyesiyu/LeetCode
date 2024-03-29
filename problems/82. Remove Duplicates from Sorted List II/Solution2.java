/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode ptr = head;
        while (ptr.next != null) {
            if (ptr.next.val != ptr.val) {
                ptr = ptr.next;
                prev = prev.next;
            } else {
                while (ptr.next != null && ptr.next.val == ptr.val) {
                    ptr = ptr.next;
                }
                prev.next = ptr.next;
                ptr = prev.next;
                if (ptr == null) {
                    break;
                }
            }
        }
        return sentinel.next;
    }
    /*
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
    */
}