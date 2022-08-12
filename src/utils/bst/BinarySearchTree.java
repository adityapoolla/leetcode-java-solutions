package utils.bst;

import utils.TreeNode;

import java.util.*;

public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree() {
        this. root = null;
    }

    public void insert(int element) {
        TreeNode treeNode = new TreeNode(element);
        if(root == null) {
            root = treeNode;
            return;
        }
        TreeNode current = root;
        TreeNode parent = current;
        while(current != null) {
            parent = current;
            if(element < current.val)
                current = current.left;
            else
                current = current.right;
        }
        if(parent.val > element)
            parent.left = treeNode;
        else
            parent.right = treeNode;
    }

    public TreeNode lookup(int element) {
        TreeNode current = root;
        while(current != null || current.val == element) {
            if(current.val == element)
                break;
            if(current.val > element)
                current = current.left;
            else
                current = current.right;
        }
        return current;
    }


    public boolean remove(TreeNode root, int element) {
        //search for element
        //if v is a leaf just remove
        //if v has only one child the bypass it
        if(root == null) {
            return false;
        }
        TreeNode currentTreeNode = root;
        TreeNode parentTreeNode = currentTreeNode;
        while(currentTreeNode != null) {
            if(currentTreeNode.val > element) {
                parentTreeNode = currentTreeNode;
                currentTreeNode = currentTreeNode.left;
            } else if(currentTreeNode.val < element) {
                parentTreeNode = currentTreeNode;
                currentTreeNode = currentTreeNode.right;
            } else {
                //currentNode is element
                //case 1 currentNode is a leaf;
                if(currentTreeNode.left == null && currentTreeNode.right == null) {
                    if(parentTreeNode.left == currentTreeNode)
                        parentTreeNode.left = null;
                    else parentTreeNode.right = null;
                    return true;
                }
                // case 2 if currentNode has only one child
                else if(currentTreeNode.left == null || currentTreeNode.right == null) {
                    if(parentTreeNode.left == currentTreeNode) {
                        if(currentTreeNode.left == null)
                            parentTreeNode.left = currentTreeNode.right;
                        else parentTreeNode.left = currentTreeNode.left;
                    } else {
                        if(currentTreeNode.left == null)
                            parentTreeNode.right = currentTreeNode.right;
                        else parentTreeNode.right = currentTreeNode.left;
                    }
                    return true;
                }
                // case 3 if current Node has both childs
                // use highest in left child or least in right child as successor
                else
                {
                    TreeNode treeNodeToremove = currentTreeNode;
                    // choose least node in right child;
                    TreeNode treeNode = currentTreeNode.right;
//                    while(node)
                }
            }
        }
        return true;
    }

    // BFS Traversal
    public void breadthFirstSearch() {
        TreeNode current = this.root;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(current);
        while(queue.size() > 0) {
            TreeNode treeNode = queue.poll();
            System.out.print(treeNode.val +", ");
            if(treeNode.left != null)
                queue.add(treeNode.left);
            if(treeNode.right != null)
                queue.add(treeNode.right);
        }
    }

    public void inorderDstIterative() {
        if(this.root == null)
            return;
        TreeNode curr = root;
        Stack<TreeNode> s = new Stack();
        while(!s.empty() || curr != null) {
            while(curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(" " + curr.val);
            curr = curr.right;
        }
    }

    public void printBST() {
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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        tree.insert(45);
        tree.insert(180);
        tree.insert(190);
        tree.insert(200);
        tree.printBST();
        System.out.println(tree.remove(tree.root,45));
        System.out.println(tree.remove(tree.root,170));
        tree.printBST();
        System.out.println(tree.lookup(20).val);
        tree.breadthFirstSearch();
    }
}
//     9
//  4     20
//1  6  15  170