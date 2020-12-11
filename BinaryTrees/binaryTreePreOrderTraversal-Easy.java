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
    public List<Integer> preorderTraversal(TreeNode root) {
        // FOR RECURSION
        // List<Integer> result = new ArrayList<Integer>();
        // return recursivePreOrder(root, result);
        
        
        //ITERATIVELY
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        if(root==null) return result;
        while(!stack.isEmpty()) {
            TreeNode node = stack.peek();
            result.add(node.val);
            stack.pop();
            if(node.right!=null)stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return result;
        
    }
    private List<Integer> recursivePreOrder(TreeNode root, List<Integer> result) {
        
        if(root!=null) {
            result.add(root.val);
            recursivePreOrder(root.left, result);
            recursivePreOrder(root.right, result);
        }
        return result;
    }
}