package programmers.src.programmers;

import java.util.Arrays;
import java.util.Stack;

public class BackMax {
    public static void main(String[] args) {
//       int [] numbers = {2, 3, 3, 5};
        int [] numbers = {9, 1, 5, 3, 6, 2};
        int [] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<numbers.length; i++){
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.add(i);

        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }

    }
}
