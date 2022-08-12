package problems601To700.problem617;

import utils.TreeNode;
import utils.bst.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
class Solution {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode head = root1;
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        stack1.push(root1);
        stack2.push(root2);
        while(stack1.size() > 0 && stack2.size() >0) {
            root1 = stack1.pop();
            root2 = stack2.pop();
            root1.val = root1.val + root2.val;
            if(root1.val == 0)
                root1 = null;
            if(root1.left == null && 
               root1.right == null && 
               root2.left == null && 
               root2.right == null) {
                continue;
            }
            if(root1.left == null)
                root1.left = new TreeNode(0);
            if(root1.right == null)
                root1.right = new TreeNode(0);
            if(root2.left == null)
                root2.left = new TreeNode(0);
            if(root2.right == null)
                root2.right = new TreeNode(0);
            stack1.push(root1.left);
            stack1.push(root1.right);
            stack2.push(root2.left);
            stack2.push(root2.right);
        }
        return head;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode root = mergeTrees(root1, root2);


        {
            Queue<TreeNode> elements = new LinkedList<>();
            elements.add(root);
            while(elements.size() != 0) {
                TreeNode current = elements.poll();
                System.out.print("node -> "+ current.val);

                if(current.left != null) {
                    System.out.print(" | left -> " +current.left.val);
                    elements.add(current.left);
                }
                if(current.right != null) {
                    System.out.print(" | right -> " +current.right.val);
                    elements.add(current.right);
                }
                System.out.println();
            }
        }
    }
}