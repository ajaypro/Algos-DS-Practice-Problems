package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 23-08-2019, 23:19
 * @project Algos&Ds
 */
public class TreeHeight {

    Node root;

    public static void main(String[] args) {

        TreeHeight tree = new TreeHeight();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " +
                height(tree.root));

    }


    static int height(Node root) {
        if (root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        } else {
            System.out.println("Tree is empty");
            return -1;
        }
    }
}
