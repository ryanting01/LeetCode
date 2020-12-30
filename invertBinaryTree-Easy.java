/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root==null) return root;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.addFirst(root);

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            TreeNode temp = currNode.right;
            currNode.right=currNode.left;
            currNode.left = temp;
            if(currNode.left!=null) queue.add(currNode.left);
            if(currNode.right!=null) queue.add(currNode.right);

        }
        return root;

    }

}