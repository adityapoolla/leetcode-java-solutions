package problems201To300.problem257;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return null;
        util(root, new StringBuilder(""));
        return paths;
    }
    
    public void util(TreeNode node, StringBuilder str) {
        if(node == null)
            return;
        int len = str.length();
        str.append(node.val);
        if(node.left == null && node.right == null) {
            paths.add(str.toString());
        } else {
            str.append("->");
        }
        util(node.right, str);
        util(node.left, str);
        str.setLength(len);
    }
}