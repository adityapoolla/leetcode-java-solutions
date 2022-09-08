package problems1To100.problem94;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursion(root, result);
        return result;
    }
    
    public void inorderTraversalRecursion(TreeNode node, List<Integer> list) {
        if(node == null)
            return;
        inorderTraversalRecursion(node.left, list);
        list.add(node.val);
        inorderTraversalRecursion(node.right, list);
    }

    public void inorderTraversalIterative(TreeNode node) {

    }
}