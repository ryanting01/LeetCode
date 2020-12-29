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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null) return new ArrayList<List<Integer>>();

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.addLast(root);
        queue.addLast(null);
        Boolean goLeft = true;
        LinkedList<Integer> currLevel = new LinkedList<>();

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.pollFirst();
            if(currNode!=null) {
                if(goLeft) currLevel.addLast(currNode.val);
                else currLevel.addFirst(currNode.val);
                if (currNode.left!=null) queue.addLast(currNode.left);
                if(currNode.right!=null) queue.addLast(currNode.right);
            }
            else {
                result.add(currLevel);
                currLevel = new LinkedList<Integer>();
                if(!queue.isEmpty()) {
                    queue.addLast(null);
                }
                goLeft = !goLeft;
            }
        }
        return result;

    }

}