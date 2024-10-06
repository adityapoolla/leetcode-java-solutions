package problems2101To2200.problem2196;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.createBinaryTree(new int[][] {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}});
	}
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Map<Integer, Boolean> rootNode = new HashMap<>();
        for(int i = 0; i < descriptions.length; i++) {
            TreeNode parent, child;
            int first = descriptions[i][0], second = descriptions[i][1], third = descriptions[i][2];
            if(map.get(first) != null) 
                parent = map.get(first); 
            else parent = new TreeNode(first);
            if(map.get(second) != null) 
                child = map.get(second);
            else child = new TreeNode(second);
            if(third == 1) 
                parent.left = child;
            else 
                parent.right = child;
            map.put(first, parent);
            map.put(second, child);

            // if((rootNode.get(descriptions[i][0]) != null && rootNode.get(descriptions[i][0]) != false) || rootNode.get(descriptions[i][0]) == null) {
            //     rootNode.put(descriptions[i][0], true);
            // } else {
            //     rootNode.put(descriptions[i][0], false);
            //     rootNode.put(descriptions[i][1], false);
            // }
        }
        // for(Map.Entry<Integer, Boolean> e: rootNode.entrySet()) {
        //     if(e.getValue() == true) {
        //         return map.get(e.getKey());
        //     }
        // }
        return map.get(50);

    }

}

class TreeNode {
	   int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }