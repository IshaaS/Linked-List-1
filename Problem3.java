// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//first find if there is a loop using a slow 1x and fast 2x pointer and then make one of them
//equal to head and then they will meet at the starting of the cycle.
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
       ListNode slow=head;
       ListNode fast=head;
       boolean flag = false;
       while(fast!=null && fast.next!=null && !flag){
        fast=fast.next.next;
        slow=slow.next;
        if(slow==fast) flag=true;
       }
       if(!flag) return null;
       slow=head;
       while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
       }
       return slow;
    }
}