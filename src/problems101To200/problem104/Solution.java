package problems101To200.problem104;

import utils.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        return depthOfTreeUtil(root);
    }
    
    public int depthOfTreeUtil(TreeNode node) {
        if(node == null)
            return 0;
        return 1 + Math.max(depthOfTreeUtil(node.left), depthOfTreeUtil(node.right));
    }
}