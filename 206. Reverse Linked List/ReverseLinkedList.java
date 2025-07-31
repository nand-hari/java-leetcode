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
        ListNode reverse= null;
        while(head!=null){
            ListNode temp = head.next;
            head.next=reverse;
            reverse= head;
            head=temp;
        }
        return reverse;
        
    }
}
/*
i1
rev= null 
temp=2->3->4->5->null
head.next=null 
head=1->null
rev=1->null
head=2->3->4->5->null

i2 
temp=3->4->5->null
head.next=1->null
head=2->1->null
rev=2->1->null
head= 3->4->5->null

i3
temp =4->5->null
head.next=2->1->null
rev=3->2->1->null
head= 5->null

i4 
temp */



/*1->2 ->3->4->5->null
head.data -1 
head.next - 2
output - 5->4->3->2->1->null 
*/
