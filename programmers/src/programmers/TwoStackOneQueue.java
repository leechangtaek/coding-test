package programmers.src.programmers;

import java.util.Stack;

public class TwoStackOneQueue {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        System.out.println("stack1 = " + stack1);

        int count = stack1.size();

        for(int i=0; i<count; i++){
            stack2.push(stack1.pop());
        }
        System.out.println("stack2 = " + stack2);
    }

}
