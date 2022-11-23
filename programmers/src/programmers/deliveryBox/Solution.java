package programmers.src.programmers.deliveryBox;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        //int order [] = {4, 3, 1, 2, 5};
        int order [] = {5, 4, 3, 2, 1};

        int answer = 0;
        Stack<Integer> st = new Stack<Integer>();

        int nextNum = 0;

        for(int boxNum=1; boxNum<=order.length; boxNum++) {
            if(order[nextNum] != boxNum) {
                st.push(boxNum);
                continue;
            }
            answer ++;
            nextNum++;
            while(st.size()!=0 && order[nextNum] == st.peek() ) {
                answer++;
                nextNum++;
                st.pop();
            }
        }
        System.out.println(answer);
    }
}
