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
        while(root!=null) {
            
        }
        
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