package practice.linkedlists;

/**
 * @author AjayDeepakSrinivasan on 04-12-2019, 13:15
 * @project Algos&Ds
 * Problem: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contains a single digit.
 * Add the two numbers and return it as a linked list.
 * For Example:
 * <p>
 * Input: (1 -> 8-> 2) + (3 -> 6 -> 5)
 * Output: (4-> 4-> 8)
 * Explanation: 281+ 563= 844.
 * <p>
 * Input: (4 -> 8-> 1) + (3 -> 6 )
 * Output: 7-> 4-> 2
 * Explanation: 184+ 63= 247
 */

public class SumLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }



    static Node addTwoNumbers(Node A, Node B) {
        Node head = null, currentNode = null;
        int carry = 0; // carry for the sum

        while ((A != null) && (B != null)) {

            int sum = A.data + B.data + carry;
            carry = sum / 10;
            sum = sum % 10;

            if (head == null) {
                head = new Node(sum);
                currentNode = head;
            } else {
                currentNode.next = new Node(sum);
                currentNode = currentNode.next;
            }
            // moving to next element in the list
            A = A.next;
            B = B.next;
        }

        // In case if A is not fully iterated
        while (A != null) {
            int sum = A.data + carry;
            carry = sum / 10;
            sum = sum % 10;

            currentNode.next = new Node(sum);
            currentNode = currentNode.next;
            // moving to next element in the list
            A = A.next;
        }
        // In case if B is not fully iterated
        while (B != null) {
            int sum = B.data + carry;
            carry = sum / 10;
            sum = sum % 10;

            currentNode.next = new Node(sum);
            currentNode = currentNode.next;
            // moving to next element in the list
            B = B.next;
        }

        /*if (carry != 0) {
            currentNode.next = new Node(carry);
        }*/
    return head;
    }

    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String []args){

        Node NodeA, NodeB, NodeC;

        NodeA = new SumLists.Node(1);
        NodeA.next = new SumLists.Node(8);
        NodeA.next.next = new SumLists.Node(2);
        /*NodeA.next.next.next = new SumLists.Node(32);
        NodeA.next.next.next.next = new SumLists.Node(45);*/

        NodeB = new SumLists.Node(3);
        NodeB.next = new SumLists.Node(6);
        NodeB.next.next = new SumLists.Node(5);
        /*NodeB.next.next.next = new SumLists.Node(21);
        NodeB.next.next.next.next = new SumLists.Node(89);*/

        NodeC = addTwoNumbers(NodeA, NodeB);

        System.out.println("Sum linked list ");
        printList(NodeC);
    }
}
