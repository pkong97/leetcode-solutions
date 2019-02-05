// 19. Remove Nth Node From End of List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 6ms, faster than 98.75% of submissions
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head, prev = head;
        int counter = 0;
        while (curr != null) {
            counter++;
            curr = curr.next;
        }
        curr = head;
        counter -= n;
        if (counter == 0) {
            return head.next;
        }
        while (counter > 0) {
            prev = curr;
            curr = curr.next;
            counter--;
        }
        prev.next = curr.next;
        return head;
        
    }
}