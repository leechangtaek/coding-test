package programmers.test7;

import java.util.Arrays;

/*
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
	1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요. 
 */
public class Solution {

	
	public static void main(String[] args) {
		Solution s = new Solution();
		int a [] = {4,1,3,2};
		int b [] = {4,1,3};
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	
	public boolean solution(int[] arr) {
		boolean answer = true;
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr.length || arr2[arr[i]-1]!=0) {
				answer = false;
				break;
			}else {
				arr2[arr[i]-1]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		return answer;
	}
}
