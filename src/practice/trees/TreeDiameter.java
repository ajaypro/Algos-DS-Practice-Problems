package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 23-08-2019, 22:07
 * @project Algos&Ds
 * The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes.
 * The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded
 * (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
 */

public class TreeDiameter {

    Node root;

    int diameter(Node node) {

        // keep count of no. of nodes covered
        int count;

        if (node == null) {
            System.out.println("Tree is empty");
            return 0;
        }


            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // daimeters of left and right subtrees

            int leftDiameter = diameter(node.left);
            int rightDiameter = diameter(node.right);

            return Math.max(leftHeight + rightHeight + 1,
                    Math.max(leftDiameter, rightDiameter));

    }

    int treediameter(){
        return diameter(root);
    }

   // height is max depth of the tree
    static int height(Node node){

        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String []args){

        TreeDiameter tree = new TreeDiameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.right = new Node(7);

        System.out.println("The diameter of given binary tree is : "
                + tree.treediameter());
    }



}
