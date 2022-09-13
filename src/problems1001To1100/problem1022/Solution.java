package problems1001To1100.problem1022;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public int sumRootToLeaf(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        util(root, result, 0);
        int total = 0;
        for(Integer i : result)
            total +=i;
        return total;
    }

    public void util(TreeNode node, List<Integer> list, int sum) {
        if(node.left == null && node.right == null) {
            sum += node.val;
            list.add(sum);
            return;
        }
        sum = sum + node.val;
        int temp = sum;
        if(node.left != null) {
            util(node.left, list, sum << 1);
        }
        sum = temp;
        if(node.right != null) {
            util(node.right, list, sum << 1);
        }
    }

    public static void main(String[] args) {
        //[1,0,1,0,1,0,1]
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        new Solution().sumRootToLeaf(root);
    }
}