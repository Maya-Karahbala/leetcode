/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head== null || head.next== null)return  null;
        ListNode current= head;
        var nodes= new ArrayList<ListNode>();
        while (current!= null){
            if(!nodes.contains(current)) nodes.add(current);
            else {
                return current;
            }
            current= current.next;
        }
        return null;
    }
}