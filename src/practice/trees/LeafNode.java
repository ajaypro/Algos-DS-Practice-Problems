package practice.trees;


/**
 * @author AjayDeepakSrinivasan on 25-09-2019, 12:16
 * @project Algos&Ds
 * <p>
 * Program to count leaf nodes in a binary tree
 *
 * Defining logic : we check if node has left child and right child then we traverse to find the leaf node
 *  this is done by recursion, once a sub-tree is completed then it goes next sub-tree.
 */


public class LeafNode {

    static Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

   static int getLeafNode(){
        return leafNodes(root);
    }

    static int leafNodes(Node node) {

        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;
        else
            return leafNodes(node.left) + leafNodes(node.right);
    }

    public static void main(String[] args) {

       root = new Node(1);
       root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.left.right.left = new Node(8);

        System.out.println("The leaf count of binary tree is : "
                + getLeafNode());
    }
}
