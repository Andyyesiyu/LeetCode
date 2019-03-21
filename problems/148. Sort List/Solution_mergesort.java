/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return mergeSort(head, tail);
    }

    private ListNode mergeSort(ListNode head, ListNode tail) {
        if (head == tail) {
            return head;
        }
        // Find the middle node.
        int count = 0;
        ListNode p = head;
        while (p != tail) {
            count++;
            p = p.next;
        }
        ListNode mid = head;
        for (int i = 0; i < count / 2; i++) {
            mid = mid.next;
        }
        ListNode temp = mid.next;
        mid.next = null;
        ListNode left = mergeSort(head, mid);
        ListNode right = mergeSort(temp, tail);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode sentinel = new ListNode(0);
        ListNode ptr = sentinel;
        while (left != null && right != null) {
            if (left.val < right.val) {
                ListNode temp = left.next;
                ptr.next = left;
                ptr = ptr.next;
                left = temp;
            } else {
                ListNode temp = right.next;
                ptr.next = right;
                ptr = ptr.next;
                right = temp;
            }
        }
        if (left == null) {
            ptr.next = right;
        } else {
            ptr.next = left;
        }
        return sentinel.next;
    }
}