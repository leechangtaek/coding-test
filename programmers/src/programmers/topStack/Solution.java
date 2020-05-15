package programmers.topStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int a [] = {6,9,5,7,4};
		int b [] = {3,9,9,3,5,7,2};
		int c [] = {1,5,3,6,7,6,5};
		
		System.out.println("결과:"+Arrays.toString(s.solution(a)));
		System.out.println("결과:"+Arrays.toString(s.solution(b)));
		System.out.println("결과:"+Arrays.toString(s.solution(c)));
	}
	public int[] solution(int [] heights) {
		int [] answer = new int[heights.length];
		
//		HashMap<Integer, Integer> map = new HashMap<>();
//		Stack<Integer> stack = new Stack<>();
//		for(int i = heights.length - 1; i >= 0; i--){
//			if(stack.isEmpty()){
//				stack.push(heights[i]);
//			}else{
//				Stack<Integer> tmp = new Stack<>();
//				while(!stack.isEmpty() && stack.peek() >= heights[i]){
//					tmp.push(stack.pop());
//				}
//				while(!stack.isEmpty() && stack.peek() < heights[i]){
//					map.put(stack.pop(), i + 1);
//				}
//				while(!tmp.isEmpty()){
//					stack.push(tmp.pop());
//				}
//				stack.push(heights[i]);
//			}
//		}
//
//		for(int i = heights.length - 1; i >= 0; i--){
//			if(map.containsKey(heights[i])){
//				answer[i] = map.remove(heights[i]);
//			}
//		}
		
		for(int i=0; i<heights.length; i++) {
			for(int j=i+1; j<heights.length; j++) {
				if(heights[i]>heights[j]) {
					answer[j]=i+1;
				}
			}
		}
		
		return answer;
		
	}

}
