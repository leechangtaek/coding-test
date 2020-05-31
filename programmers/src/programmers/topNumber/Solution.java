package programmers.topNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a [] = {6, 10, 2};
		int b[] = {3, 30, 34, 5, 9};
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = (String.valueOf(numbers[i]));
        }
        
        Arrays.sort(arr,new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		return(s2+s1).compareTo(s1+s2);
        	}
		});
        
        if(arr[0].equals("0")) return "0";
        
        for(int i=0; i<arr.length; i++) {
        	answer+=arr[i];
        }
        
        return answer;
    }

}
