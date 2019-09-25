package practice.linkedlists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author AjayDeepakSrinivasan on 25-09-2019, 11:07
 * @project Algos&Ds
 */
public class QueSub {

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

    void pop(int data) {
        Node node = new Node(data);

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



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){

            int queries = Integer.parseInt(br.readLine());

        }

        QueSub queue = new QueSub();

    }
}
