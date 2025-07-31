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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
        
    }
}
// time - O(n)
// space - O(1)
// i1 
// fast = 3->2->0->4
// slow= 3->2->0->4
// i2 
// fast = 4
// slow= 2->0->4
// i3 
// fast = 3->2
// slow= 2->0->4
// i4 
// fast = 3->2->0->4
// slow= 0->4
