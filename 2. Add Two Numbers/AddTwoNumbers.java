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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int result = v1 + v2 + carry;

            carry = result / 10;
            result = result % 10;

            current.next = new ListNode(result);

            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        return dummy.next;

    }
}

// 2 4 3 
// 5 6 4 
// dummy = null 
// current =dummy = null 
// carry = 0 


// i= 1
// v1 = 2 v2= 5 carry = 0 result = 7 , carry = 0 , result 7 , curr = 7 dummy = 7 
// i2 
// v1=4 v2= 6 carry =0 res=10 , carry = 1, result = 10 , curr = 0 dummy = 7->0
// i3 
// v1=3 v2=4 carry =1 result = 8 , carry = 0 , result =8 , current = 8 , dummy = 7->0->8


// 1  -- > carry 
// 2 --> l1 and l2 are not always equal 
// 3 --> always comsider carry 
// 4 --> if value is null make it 0 

// 2 4 3 , 5 6 4 
// 1
// 9 4 0 
// 4 6 5
// -------
// 1 4 0 5 

// 7 0 8 
