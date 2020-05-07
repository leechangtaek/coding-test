package programmers.test8;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] a = {{1,4},{3,4},{3,10}};
		int[][] b = {{1,1},{2,2},{1,2}};
		
		System.out.println("결과:"+Arrays.toString(s.solution(a)));
		System.out.println("결과:"+Arrays.toString(s.solution(b)));
	}
	
	public int[] solution(int [][] arr) {
		int [] answer = new int [2];
		
		if(arr[0][0]==arr[1][0]) {
			answer[0]=arr[2][0];
		}else if(arr[0][0]==arr[2][0]) {
			answer[0]=arr[1][0];
		}else if(arr[1][0]==arr[2][0]) {
			answer[0]=arr[0][0];
		}
		
		if(arr[0][1]==arr[1][1]) {
			answer[1]=arr[2][1];
		}else if(arr[0][1]==arr[2][1]) {
			answer[1]=arr[1][1];
		}else if(arr[1][1]==arr[2][1]) {
			answer[1]=arr[0][1];
		}
		
		return answer;
	}

}
