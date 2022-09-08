package problems101To200.problem101;

import utils.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTreeUtil(root.left, root.right);
    }
    
    public boolean isSameTreeUtil(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        return isSameTreeUtil(p.left, q.right) && isSameTreeUtil(p.right, q.left);
    }
}