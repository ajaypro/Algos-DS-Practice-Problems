package practice.stack;

import java.util.Stack;

/**
 * @author AjayDeepakSrinivasan on 21-08-2019, 11:26
 * @project Algos&Ds
 */
public class MinimumElement {

    public static void main(String[] args) {

        MinimumElement minimumElement = new MinimumElement();
        minimumElement.push(5);
        System.out.println(minimumElement.getMinValue());

        minimumElement.push(7);
        System.out.println(minimumElement.getMinValue());

        minimumElement.push(2);
        System.out.println(minimumElement.getMinValue());

        minimumElement.push(1);
        System.out.println(minimumElement.getMinValue());

        minimumElement.push(9);
        System.out.println(minimumElement.getMinValue());

        minimumElement.push(12);
        System.out.println(minimumElement.getMinValue());

        minimumElement.pop();
        System.out.println(minimumElement.getMinValue());
        /*for(Integer items: minimumElement.stack)
            System.out.println(items);*/
        //for (int i = 0 ; i < minimumElement.stack.capacity())


    }

    private Stack<Integer> stack = new Stack<>();

    private int minValue;

    void push(int givenValue) {

        // Edge case
        if (stack.empty()) {
            stack.push(givenValue);
            minValue = givenValue;
        }
        // no need to updated minvalue
        else if (givenValue > minValue) {
            stack.push(givenValue);
            // minvalue is smaller so apply the formula and update new minvalue as givenvalue
        } else {
            stack.push(2 * givenValue - minValue);
            minValue = givenValue;
            System.out.println("Minimum value in stack :" + minValue);
        }
    }

    int pop() {

        //edge case

        if (stack.empty()) {
            System.out.println("Stack is empty");
        }

        int top = stack.peek();

        if (top < minValue)
            minValue = 2 * minValue - top;
        stack.pop();
        System.out.println("Minimum value in stack after popping :" + minValue);
        return minValue;
    }

    public int getMinValue(){
        return minValue;
    }


}
