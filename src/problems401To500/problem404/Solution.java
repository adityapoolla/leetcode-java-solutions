package problems401To500.problem404;

import utils.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        return util(root, 0, false);
    }
    
    public int util(TreeNode node, int val, boolean isLeft) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null) {
            if(isLeft)
                return node.val;
            else return 0;
        }
        int leftVal = util(node.left, val, true);
        int rightVal = util(node.right, val, false);
        return leftVal + rightVal;
    }
}