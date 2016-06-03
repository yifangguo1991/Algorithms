//Given a singly linked list, determine if it is a palindrome.
//
//Follow up:
//Could you do it in O(n) time and O(1) space?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while(fast != null && fast.next != null) {//遍历获取中点节点
        fast = fast.next.next;
        slow = slow.next;
    }
    if(fast != null) slow = slow.next;

    slow = reverse(slow);//倒置右半边单链
    while(slow != null && head.val == slow.val) {//逐个值比较
        head = head.next;
        slow = slow.next;
    }
    return slow == null;
}

private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while(head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
}
