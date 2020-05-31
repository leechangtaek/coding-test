package programmers.hIndex;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int [] a = {3, 0, 6, 1, 5};
		
		System.out.println("결과:"+s.solution(a));
	}
	public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++) {
        	int h = citations.length-i;
        	if (citations[i] >= h) {
        		answer = h;
        		break;
        	}
        }
        
        return answer;
    }

}
