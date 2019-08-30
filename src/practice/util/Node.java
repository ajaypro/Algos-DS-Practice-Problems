package practice.util;

/**
 * @author AjayDeepakSrinivasan on 22-08-2019, 11:21
 * @project Algos&Ds
 */
public class Node {

    public int key;
    public Node left, right;

    public Node(){};

    public Node(int data){
        this.key = data;
        left = right = null;
    }
}
