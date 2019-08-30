package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 23-08-2019, 23:34
 * @project Algos&Ds
 *
 * Finding tree diameter in optimized way by calculating height in same recursion
 */

public class TreeDiameter2 {

     Node root;

    class Height{
        int h;
    }
    Height height = new Height();

    int treediameter(){
        return diameter(root, height);
    }

    private int diameter(Node node, Height height){

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        if(node == null){
            height.h = 0 ;
            return 0;
        }

        int leftDiameter = diameter(node.left, leftHeight);
        int rightDiameter = diameter(node.right, rightHeight);

        /* Height of current node is max of heights of left and
         right subtrees plus 1*/
        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;

        return Math.max(height.h, Math.max(leftDiameter, rightDiameter));

    }

    public static void main(String []args){

 TreeDiameter2 tree = new TreeDiameter2();
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
