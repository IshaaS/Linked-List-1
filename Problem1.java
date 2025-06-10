// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//we are using recursion to get the last node as reversed head
// rest all head.next.next is head and head .next is null==> this reverses the nodes direction

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

//iterative
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head == null) return head;
//         ListNode prev = null;
//         ListNode current = head;
//         while(current!= null){
//             ListNode temp = current.next;
//             current.next = prev;
//             prev = current;
//             current = temp;
//         }
//         return prev;
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }
}