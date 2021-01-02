/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {


    public Node connect(Node root) {

        if(root==null) return null;

        LinkedList<Node> queue = new LinkedList<>();

        queue.addFirst(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            int count=0;
            while(count<size) {
                Node currNode = queue.poll();
                if(currNode.left!=null) queue.add(currNode.left);
                if(currNode.right!=null) queue.add(currNode.right);
                if(count==size-1) currNode.next=null;
                else currNode.next = queue.peek();
                count++;
            }
        }
        return root;


    }

}