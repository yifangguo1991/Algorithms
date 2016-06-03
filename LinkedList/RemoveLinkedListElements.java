//Remove all elements from a linked list of integers that have value val.
//
//Example
//Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//Return: 1 --> 2 --> 3 --> 4 --> 5


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        ListNode node = head;
        while(node != null && node.next != null){
            if(node.next.val == val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
            
        }
        return head;
        
    }
}
