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
    public boolean isPalindrome(ListNode head) {
        ListNode trav=head;
        Stack<Integer> stack=new Stack<>();
        while(trav!=null){
            stack.push(trav.val);
            trav=trav.next;
        }
        trav=head;
        while(trav!=null){
            if(stack.peek()!=trav.val)
                return false;
            stack.pop();
            trav=trav.next;
        }
        return true;
    }
}