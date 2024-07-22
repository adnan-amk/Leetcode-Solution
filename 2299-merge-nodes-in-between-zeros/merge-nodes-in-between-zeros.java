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

    public ListNode mergeNodes(ListNode head) {
        ListNode cur=head;
        while(cur.next!=null)
        {
            ListNode node=cur.next;
            cur=cur.next;
            while(cur.next.val!=0)
            {
                node.val+=cur.next.val;
                cur=cur.next;
            }
            cur=cur.next;
            node.next=cur.next;
        }

        return head.next;
    }
}