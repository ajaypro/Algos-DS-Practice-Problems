package practice.linkedlists;

/**
 * @author AjayDeepakSrinivasan on 25-09-2019, 09:57
 * @project Algos&Ds
 * Implement queue using linkedlist
 * Queue - Last in first out
 */

class Que {

    private static Node head;
    private static Node last;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void enqueue(Node node) {

        if (last == null) {
            head = last = node;
            System.out.println(head.data);
            return;
        }

        // if last is not empty then insert node at last, i.e inserting to next element of currentlast item

        last.next = node;
        last = node;


        System.out.println(last.data);
    }

    Node dequeue() {

        if (head == null) {
            return null;
        }

        // Store current first node to temp node and its next node will become first node
        Node tempNode = head;
        head = head.next;

        if (head == null) {
            last = null; // if head is null, change last also to null
        }
        return tempNode;
    }



    public static void main(String[] args) {

        Que queue = new Que();
        queue.enqueue(new Node(10));
        queue.enqueue(new Node(20));
        //queue.dequeue();
        //queue.dequeue();
        queue.enqueue(new Node(30));
        queue.enqueue(new Node(40));
        queue.enqueue(new Node(60));
        queue.enqueue(new Node(70));

        //System.out.println("Dequeued item :" + queue.dequeue().data);
    }
}
