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
    public ListNode reverseList(ListNode head) {
     return fixNext(head,null);
    }
    public  ListNode    fixNext(ListNode  currentNode,ListNode prev){
        if(currentNode == null) return prev ;
        ListNode nextNode= currentNode.next;
        currentNode.next= prev;
        return fixNext(nextNode,currentNode);
    }
}