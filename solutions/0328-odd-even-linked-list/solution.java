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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;

        ListNode originalEven = head.next;
        ListNode originalOdd = head;

        ListNode odd = originalOdd;
        ListNode even = originalEven;
        ListNode temp = even.next;

        boolean isEven = false;
        while(temp != null) {
            if(isEven) {
                even.next = temp;
                even = even.next;
                isEven = false;
            }
            else {
                odd.next = temp;
                odd = odd.next;
                isEven = true;
            }
            temp = temp.next;
        }
        if(even.next != null) even.next = null;
        odd.next = originalEven;
        return originalOdd;
    }
}
