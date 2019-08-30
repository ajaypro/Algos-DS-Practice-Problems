package practice.trees;

import practice.util.Node;

import java.util.Scanner;

/**
 * @author AjayDeepakSrinivasan on 22-08-2019, 12:44
 * @project Algos&Ds
 */

public class BinaryTreeHeight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter height of tree");

        int treeheight = scanner.nextInt();

        if (treeheight > 7) {
            System.out.println(" height of tree" + treeheight);

            int data = scanner.nextInt();

            Node root = null;
            while (treeheight-- > 0) {
                int key = scanner.nextInt();
                root = insert(root, data);
            }
            scanner.close();
            int height = height(root);
            System.out.println(height);
        }
    }

    static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        Node currentNode;

        if (data < root.key) {
            currentNode = insert(root.left, data);
            root.left = currentNode;
        } else {
            currentNode = insert(root.right, data);
            root.right = currentNode;
        }

        return currentNode;
    }

    static int height(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }
}
