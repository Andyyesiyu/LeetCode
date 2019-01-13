/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     /*
//         runtime theta N;
//         memory theta N;
//     */
//     public ListNode reverseList(ListNode head) {
//         // Iteratively.
//         // Create a new linked list, with a sentinel node.
//         ListNode sentinel = new ListNode(-1);
//         ListNode ptr = head;
//         while (ptr != null) {
//             ListNode nextAddress = sentinel.next;
//             sentinel.next = new ListNode(ptr.val);
//             sentinel.next.next = nextAddress;
//             ptr = ptr.next;
//         }
//         return sentinel.next;
//     }
// }

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // runtime O(N). Memory O(1).
    public ListNode reverseList(ListNode head) {
        // Iterative.
        if (head == null) {
            return null;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode nodeToReverse = head.next;
        while (nodeToReverse != null) {
            ListNode nextNode = nodeToReverse.next;
            nodeToReverse.next = sentinel.next;
            sentinel.next = nodeToReverse;
            nodeToReverse = nextNode;
        }
        head.next = null;
        return sentinel.next;
    }
}