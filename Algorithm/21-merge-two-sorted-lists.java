// 21. Merge Two Sorted Lists
// 7ms, faster than 66.74% of submissions

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode temp = ret;
        
        while (p != null && q != null) {
            if (p.val <= q.val) {
                temp.next = new ListNode(p.val);
                temp = temp.next;
                p = p.next;
            } else {
                temp.next = new ListNode(q.val);
                temp = temp.next;
                q = q.next;
            }
        }
        if (p != null) {
            temp.next = p;
        } else if (q != null) {
            temp.next = q;
        }
        return ret.next;
    }
}