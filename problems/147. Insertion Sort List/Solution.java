/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode resultSentinel = new ListNode(Integer.MIN_VALUE);
        
        ListNode ptr = head;
        while(ptr != null) {
            int currentValue = ptr.val;
            ListNode previous = resultSentinel;
            while (previous.next != null) {
                if (previous.next.val < currentValue) {
                    previous = previous.next;
                } else {
                    break;
                }
            }
            ListNode newNode = new ListNode(currentValue);
            newNode.next = previous.next;
            previous.next = newNode;
            ptr = ptr.next;
        }
        return resultSentinel.next;
    }
}