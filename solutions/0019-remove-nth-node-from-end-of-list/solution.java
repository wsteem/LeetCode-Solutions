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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //add another node for edge cases (temperary)
        ListNode node = new ListNode(0); 
        node.next = head;

        ListNode gap1 = node;
        ListNode gap2 = node;

        for(int i=0; i<n; i++){
            gap2 = gap2.next;
        }

        while (gap2.next != null){
            gap1 = gap1.next;
            gap2 = gap2.next;
        }
        gap1.next = gap1.next.next;

        return node.next; //we set node.next = head at the start
    }
}
