package programmers.src.programmers.maxNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution3 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String a = "1924";
		int a1 = 2;
		String b = "1231234";
		int b1 = 3;
		String c = "4177252841";
		int c1 = 4;
		
		System.out.println("결과:"+s.solution(a, a1));
		System.out.println("결과:"+s.solution(b, b1));
		System.out.println("결과:"+s.solution(c, c1));
	}
	
	
	public String solution(String number, int k) {
		String answer ="";
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		for(int i=0; i<number.length(); i++){
			while(k>cnt && !stack.isEmpty() && stack.peek() < number.charAt(i)){
				stack.pop();
				cnt++;
			}
			stack.push(number.charAt(i));
		}
		for(int i=0; i<number.length()-k; i++){
			answer+=stack.get(i);
		}
		return answer;
	}

}
