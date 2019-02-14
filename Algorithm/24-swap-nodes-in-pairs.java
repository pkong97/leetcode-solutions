// 24. Swap Nodes in Pairs
// 2 ms, faster than 99.98% of Java submissions
// 26 MB, less than 11.54% of Java submissions
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        ListNode curr = head.next;
        ListNode prev = head;
        //swap first two
        ListNode prevPrev = prev;
        prev.next = curr.next;
        curr.next = prev;
        prev = prev.next;
        if (prev == null) {
            curr = null;
        } else {curr = prev.next;}

        while (curr != null) {
            prev.next = curr.next;
            curr.next = prev;
            prevPrev.next = curr;
            prevPrev = prev;
            prev = prev.next;
            if (prev == null) {
                curr = null;
            } else {
                curr = prev.next;
            }
        }
        return result;
    }
}