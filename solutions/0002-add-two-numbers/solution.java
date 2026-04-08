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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode node = new ListNode(0);
        ListNode current = node;
        
        int placeHolder = 0;
        int total = 0;
        while(l1 != null || l2 != null || placeHolder != 0) {
            total = 0;
            if(l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }    
            if(l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            total += placeHolder;
            placeHolder = 0;

            if(total >= 10) {
                total -= 10;
                placeHolder = 1;
            }
            current.next = new ListNode(total);
            current = current.next;
        }
        return node.next;
    }
}
