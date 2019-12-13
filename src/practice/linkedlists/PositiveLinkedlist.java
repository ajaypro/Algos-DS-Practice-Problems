package practice.linkedlists;

/**
 * @author AjayDeepakSrinivasan on 12-12-2019, 11:59
 * @project Algos&Ds
 */
public class PositiveLinkedlist {

    static class Node
    {
        int data;
        Node next;
    };


    // Function to insert node
    static Node insert(Node root, int item)
    {
        Node temp = new Node();
        Node ptr;
        temp.data = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else
        {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    static void display(Node root)
    {
        while (root != null)
        {
            System.out.print( root.data + " ");
            root = root.next;
        }
    }

    static Node arrayToList(int arr[], int n)
    {
        Node root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }



    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 2, -3, 4, -5 };
        int n = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                n = arr.length;
            }
        }

        int count=0;

        Node root = arrayToList(arr, n);

        while (root != null )
          {

              if(root.data < 0 && root.next != null){
                  root = root.next;
              } else if(root.next == null){

              }

            count++;
            root = root.next;
        }
        System.out.println(count);

    }
}
