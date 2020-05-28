package wincube.win05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a[] = {1, 5, 8, 2, 10, 5, 4, 6, 4, 8};
		int b[] = {5, 4, 4, 3, 5};

		System.out.println("결과:"+Arrays.toString(s.solution(a)));
		System.out.println("결과:"+Arrays.toString(s.solution(b)));
	}
	public int[] solution(int[] waiting) {
//		for(int i=0; i<waiting.length; i++) {
//			if(!li.contains(waiting[i])) {
//				li.add(waiting[i]);
//			}
//		}
		
		int answer[]= {};
		ArrayList<Integer> li = new ArrayList<Integer>();
//		for(int num : waiting) {
//			if(!li.contains(num)) {
//				li.add(num);
//			}
//		}
		int a = waiting[0];
		li.add(a);
		for(int num : waiting) {
			if(a != num)
                li.add(num);
            a = num;
        }    
		answer = new int[li.size()];
		for(int i=0; i<li.size(); i++) {
			answer[i] = (int)li.get(i);
		}

		return answer;
		
	}



}
