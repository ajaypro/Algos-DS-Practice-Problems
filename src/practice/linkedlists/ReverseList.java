package practice.linkedlists;

/**
 * @author AjayDeepakSrinivasan on 24-09-2019, 11:26
 * @project Algos&Ds
 * <p>
 * Given pointer to the head node of a linked list, the task is to reverse the linked list.
 * We need to reverse the list by changing links between nodes.
 * <p>
 * Method: Simple tail recursion method
 */

public class ReverseList {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseList(Node currentNode, Node prevNode) {

        if (head == null) {
            return null;
        }

        if (currentNode.next == null) {
            head = currentNode;
            currentNode.next = prevNode;
            return head;
        }

        Node nextNode = currentNode.next;
        currentNode.next = prevNode;

        reverseList(nextNode, currentNode);
        return head;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        ReverseList list = new ReverseList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked list ");
        list.printList(head);
        Node res = reverseList(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(res);
    }
}
