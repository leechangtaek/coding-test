package programmers.src.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parentheses {

    public static void main(String[] args) {

        String s = "())(()";
        System.out.println(solution(s));

    }
    public static boolean solution (String s){
        boolean answer = true;
        int open = 0;
        char[] arr = s.toCharArray();
        if(arr[0] ==')' || arr[arr.length-1]=='('){
            return false;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                open++;
            }else{
                open--;
            }
            if(open < 0 ){
                return false;
            }
        }
        if(open == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }


}
