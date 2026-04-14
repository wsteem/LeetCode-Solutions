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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newNode = new ListNode();
        newNode.val = -1;
        ListNode head = newNode;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val){
                newNode.next = list1;
                newNode = newNode.next;
                list1 = list1.next;
            }
            else {
                newNode.next = list2;
                newNode = newNode.next;
                list2 = list2.next;
            }
        }

        if(list1 != null) newNode.next = list1;
        else if(list2 != null) newNode.next = list2;

        return head.next;
    }
}
