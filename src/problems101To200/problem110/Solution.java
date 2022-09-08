package problems101To200.problem110;

import utils.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return util(root) != -1;
    }
    
    public int util(TreeNode node) {
        if(node == null)
            return 0;
        int l = util(node.left);
        if(l == -1)
            return -1;
        int r = util(node.right);
        if(r == -1)
            return -1;
        if(Math.abs(l - r) > 1)
            return -1;
        return 1 + Math.max(l, r);
    }
}