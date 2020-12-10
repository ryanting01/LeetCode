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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null) return true;
        if(head.next==null) return true;
        // System.out.println("HI");
        Stack<ListNode> stack = new Stack<>();
        
        int size = 0;
        
        ListNode temp = head;
        
        while(temp!=null) {
            temp = temp.next;
            size++;
        }

        if(size%2==0) {
            int i = 0;
            while(i<size/2) {
                stack.push(head);
                head= head.next;
                i++;
            }
            while(i<size) {
                System.out.println(size);

                if(head.val == stack.peek().val) {
                    stack.pop();
                    head = head.next;
                }
                else return false;
                i++;
            }
        }
        else if(size%2==1) {
            int i = 0;
            while(i<size/2) {
                stack.push(head);
                head= head.next;
                i++;
            }
            head = head.next;
            i++;
            while(i<size) {
                if(head.val == stack.peek().val) {
                    stack.pop();
                    head = head.next;
                }
                else return false;
                i++;
            }
        }
        
        return true;
    }
}

/*

1-2-4-4-4-4-2-1
1-2-3-2-1
*/










