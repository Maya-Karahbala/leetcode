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
    public ListNode middleNode(ListNode head) {
        int size= 1;
        ListNode currentNode= head;
        while (currentNode.next!= null){
            size++;
            currentNode= currentNode.next;
        }
        int middleIndex=  size/2+1 ;
        currentNode= head;
        for (int i = 1; i <middleIndex ; i++) {
            currentNode= currentNode.next;
        }
        return  currentNode;
    }
}