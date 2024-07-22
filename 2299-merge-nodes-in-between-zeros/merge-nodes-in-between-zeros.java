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
        ListNode tail=new ListNode();
        ListNode dummy=tail;

        while(cur.next!=null)
        {
            ListNode node=new ListNode(0);
            while(cur.next.val!=0)
            {
                node.val+=cur.next.val;
                cur=cur.next;
            }
            tail.next=node;
            tail=tail.next;
            cur=cur.next;
        }

        return dummy.next;
    }
}