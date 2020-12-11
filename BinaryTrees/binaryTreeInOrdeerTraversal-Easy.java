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
    
    public List<Integer> inorderTraversal(TreeNode root) {
       
        //FOR RECURSION
        List<Integer> result = new ArrayList<Integer>();
        return traversal(root, result);
        
//         Stack<TreeNode> stack = new Stack<>();
//         List<Integer> result = new ArrayList<Integer>();
        
//         TreeNode curr = root;
//         while(curr!=null || !stack.isEmpty()) {
//             while(curr!=null) {
//                 stack.push(curr);
//                 curr = curr.left;
//             }
//             curr = stack.pop();
//             result.add(curr.val);
//             curr = curr.right;
//         }
        // return result;
    }
    
    private List<Integer> traversal(TreeNode root, List<Integer> result) {
        
        if(root!=null) {
            traversal(root.left,result);
            result.add(root.val);
            traversal(root.right, result);
        }
        return result;
    }
    
}