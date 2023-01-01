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
         if(list1== null) return list2;
        if(list2== null) return  list1;
        ListNode mergedList,tempMergeList ;
        if( list1.val< list2.val){
            mergedList =list1;
            list1= list1.next;
        }
        else {
             mergedList= list2;
            list2= list2.next;
        }
        tempMergeList= mergedList;
        while (list1!= null || list2!= null){
            if(list1== null) {
                tempMergeList.next = list2;
                list2= list2.next;
            }
            else if(list2== null) {
                tempMergeList.next = list1;
                list1= list1.next;
            }

            else if( list1.val< list2.val){
                tempMergeList.next= list1;
                list1= list1.next;
            }
            else {
                tempMergeList.next= list2;
                list2= list2.next;
            }
            tempMergeList= tempMergeList.next;
            tempMergeList.next= null;
        }
return  mergedList;
    }
}