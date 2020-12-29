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
    
    List<TreeNode> result = new ArrayList<>();
    TreeNode topRoot = new TreeNode();
    TreeNode tempParent = new TreeNode();

    public List<TreeNode> delNodes(TreeNode root, int [] to_delete) {
        
        topRoot = root;
        HashSet<Integer> toDelete = new HashSet<>();
        for(int i:to_delete) toDelete.add(i);
        if(!toDelete.contains(root.val)) {
            dfs(root, toDelete);
            result.add(root);
        }
        else dfs(root, toDelete);
        
    
        return result;


    }

    
    public void dfs(TreeNode root, HashSet<Integer> toDelete) {
        
        if(root!=null) {
            dfs(root.left, toDelete);
            dfs(root.right, toDelete);
            if(root!=null && toDelete.contains(root.val)) {
                if(root.right!=null) result.add(root.right);
                if(root.left!=null)result.add(root.left);
                getParent(root, topRoot);
                if(tempParent.left==root) tempParent.left=null;
                else if(tempParent.right==root) tempParent.right=null;
                /*NEED TO FIX THE DELETE
                KEEP TRACK OF PARENTS OF EACH NODE WITH A HASHMAP<TREENODE, LIST<TREENODE>>, THEN DELETE REFERENCE TO CURR NODE FROM PARENT NODE*/
            } 
            
        }


    }
    
    public void getParent(TreeNode nodeToFind, TreeNode root) {
        if(root!=null) {
            if(root.left==nodeToFind) tempParent = root;
            if(root.right==nodeToFind) tempParent = root;
            getParent(nodeToFind, root.left);
            getParent(nodeToFind, root.right);
            
        }
        
        
    }

}

//     public void dfs(TreeNode root, HashSet<Integer> toDelete) {
        
//         if(root!=null) {
//             dfs(root.left, toDelete);
//             dfs(root.right, toDelete);
//             if(root.right!=null && toDelete.contains(root.right.val)) {
//                 TreeNode tempDelete = root.right;
//                 if(tempDelete.right!=null) result.add(tempDelete.right);
//                 if(tempDelete.left!=null)result.add(tempDelete.left);
//                 root.right=null;
//             }
//             else if(root.left!=null && toDelete.contains(root.left.val)) {
//                 TreeNode tempDelete = root.left;
//                 if(tempDelete.right!=null) result.add(tempDelete.right);
//                 if(tempDelete.left!=null)result.add(tempDelete.left);
//                 root.left=null;
//             }
//             else if(topRoot!=null && toDelete.contains(topRoot.val)) {
//                 if(topRoot.right!=null);
//             }
            
//         }


//     }