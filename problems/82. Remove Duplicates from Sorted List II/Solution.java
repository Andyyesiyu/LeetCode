/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /**
     * However, this solution have many corner cases.
     * Corner cases to think about:
     * 1->1
     * 1->2->3->3
     * 1
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode ptr = head;
        while (ptr != null && ptr.next != null) {
            if (haveDeletedDuplicated(ptr)) {
                // If it is true, you have to delete the current item as well.
                prev.next = prev.next.next;
                ptr = prev.next;
                continue;
            }
            ptr = ptr.next;
            prev = prev.next;
        }
        return sentinel.next;
    }
    
    private boolean haveDeletedDuplicated(ListNode ptr) {
        if (ptr.next == null || ptr.next.val != ptr.val) {
            return false;
        }
        ptr.next = ptr.next.next;
        haveDeletedDuplicated(ptr);
        return true;
    }
}