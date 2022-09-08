package problems101To200.problem111;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        return bfs(root);
    }
    
    private int bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int len = 0;
        int curDepth = 1;
        int minDepth = Integer.MAX_VALUE;
        
        while(!queue.isEmpty()) {
            len = queue.size();
            
            for(int i=0; i < len; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) {
                    return curDepth;
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            curDepth++;
        }
        
        return -1;
    }
}