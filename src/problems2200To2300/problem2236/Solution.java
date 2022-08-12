package problems2200To2300.problem2236;


import utils.TreeNode;

class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}