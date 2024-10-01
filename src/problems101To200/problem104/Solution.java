package problems101To200.problem104;

import java.util.ArrayDeque;
import java.util.Queue;

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

class Solution2 {
	//using breadth first search on binary tree 
	public int maxDepth(TreeNode root) {
		int level = 0;
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		while(queue.peek() != null) {
			int qsize = queue.size();
			for(int i = 0; i < qsize; i++) {
				TreeNode node = queue.poll();
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
			
			level++;
		}
		return level;
	}
}