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
    public int getDecimalValue(ListNode head) {
        int x = 0; // Initialize the result integer
        ListNode temp = head; // Temporary pointer to traverse the list
        
        // Traverse the linked list
        while (temp != null) {
            // Left shift the current result by 1 bit and add the current node's value
            x = (x << 1) | temp.val;
            // Move to the next node
            temp = temp.next;
        }
        
        return x; // Return the computed decimal value
    }
}