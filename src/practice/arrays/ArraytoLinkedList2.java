package practice.arrays;

/**
 * @author AjayDeepakSrinivasan on 30-08-2019, 13:53
 * @project Algos&Ds
 */
public class ArraytoLinkedList2 {

    static class Node {

        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        Node node = arrayToList(arr, n);
        display(node);


    }

    static void display(Node node) {
        while (node != null) {
            System.out.println(node.data + "  ");
            node = node.next;
        }
    }

    static Node arrayToList(int arr[], int length) {
        Node root = null;

        for (int i = length -1; i>= 0; i--)
            root = insertFirst(root, arr[i]);

        return root;
    }

    static Node insertFirst(Node root, int item) {
        Node newNode = new Node();
        newNode.data = item; // assigning value to item
        newNode.next = root;
        root = newNode;
        return root;
    }
}
