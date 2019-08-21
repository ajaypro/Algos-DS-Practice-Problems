package practice.stack;

import java.util.Objects;
import java.util.Stack;

/**
 * @author AjayDeepakSrinivasan on 21-08-2019, 12:41
 * @project Algos&Ds
 * <p>
 * check if two stacks are the same
 * Two stacks are said to be same if they contains the same elements in the same order.
 */

public class CheckStackEquality {
    public static void main(String[] args) {

        Stack<String> stack1 = new Stack<>();

        stack1.push("Android");
        stack1.push("is");
        stack1.push("great");

        Stack<String> stack2 = new Stack<>();

        stack1.push("Android");
        stack1.push("is");
        stack1.push("awesome");

        System.out.println(checkStacks(stack1, stack2));
    }

    private static boolean checkStacks(Stack<String> stack1, Stack<String> stack2) {

        if (stack1.empty() && stack2.empty()) {
            System.out.println(" Stacks are empty");
        }
        int length;
        boolean status = true;

        if (stack1.size() != stack2.size()) {
            status = false;
            return status;
        }

        while (!stack1.empty()) {

            if (Objects.equals(stack1.peek(), stack2.peek())) {
                stack1.pop();
                stack2.pop();
            } else {
                status = false;
                break;
            }
        }
        return status;
    }
}


