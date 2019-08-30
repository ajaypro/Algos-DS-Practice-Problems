package practice.arrays;

/**
 * @author AjayDeepakSrinivasan on 30-08-2019, 12:49
 * @project Algos&Ds
 */
public class ArraytoLinkedList {


    static class Node {

        int data;
        Node next;

        public Node(){}

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String []args){
        int arr[]={1, 2, 3, 4, 5};
        int n = arr.length;

        Node node = arrayToList(arr,n);
        display(node);

    }

    static void display(Node node){
        while (node != null){
            System.out.println(node.data + "  ");
            node = node.next;
        }
    }

    static Node arrayToList(int arr[], int length){
       Node root = null;

       for(int i=0; i< length; i++)
           root = insertNode(root, arr[i]);

       return root;
    }

    static  Node insertNode(Node root , int item){
        Node newNode = new Node();
        newNode.data = item; // assigning value to item
        newNode.next = null;
        Node ptr;

        if(root == null){
            root = newNode;
        } else {
            ptr = root;
            while(ptr.next != null) {
                ptr = ptr.next;
            }   // moving to next node
                ptr.next = newNode; // assigning a newnode to nextavailable node which is empty.

        }
      return root;
    }
}
