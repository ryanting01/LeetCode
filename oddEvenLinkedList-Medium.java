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
    public ListNode oddEvenList (ListNode head) {

        int size = 0;
        ListNode currNode = head;
        while(currNode!=null) {
            currNode = currNode.next;
            size++;
        }
        if(size<=2) return head;
        ListNode evenStop = head.next;

        ListNode start = head;
        ListNode end= head;
        while(end.next!=null) end= end.next;

        ListNode stop = end;
        if(size%2==1) {
            while(start!=stop && start!=stop.next) {

                ListNode tempEven = start.next;
                start.next = tempEven.next;
                end.next = tempEven;
                end = end.next;
                end.next = null;
                start = start.next;
            }

        }
        else {
            while(start!=evenStop) {
                ListNode tempEven = start.next;
                start.next = tempEven.next;
                end.next = tempEven;
                end = end.next;
                end.next = null;
                start = start.next;
            }

        }
        

        return head;

    }

}