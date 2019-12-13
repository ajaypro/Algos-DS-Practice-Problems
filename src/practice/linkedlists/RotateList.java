package practice.linkedlists;

/**
 * @author AjayDeepakSrinivasan on 06-11-2019, 11:50
 * @project Algos&Ds
 */
public class RotateList {

     Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }

    void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void printList(){
        while (head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    void rotate(int k){

        Node current = head;
        int count = 1;
        while(current != null && count < k ){
            current = current.next;
            count++;
        }

        if(current == null) return; // k value is equal to array length
        Node kNode = current;

        while(current.next != null) {
            current = current.next; // reaching last node
        }

            current.next = head; // head is assigned last node

            head = kNode.next;
            kNode.next = null;
    }

    public static void main(String []args){

        RotateList list = new RotateList();
        for( int i= 60; i >= 10; i -= 10)
          list.push(i);

          //list.printList();

          list.rotate(4);
          list.printList();

    }
}
