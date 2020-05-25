package programmers.win01;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		String a = "aabbbccd";
		String b = "abebeaedeac";
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	public int solution(String s) {
        int answer = 0;
        
        char [] alpha = new char[26];
        int [] count = new int[26];
        
        for(int i=0; i<alpha.length; i++) {
        	alpha[i] = (char)(i+97);
        }
        
        for(int i=0; i<alpha.length; i++) {
        	for(int j=0; j<s.length(); j++) {
        		if(alpha[i]==s.charAt(j)) {
        			count[i]++;
        		}
        	}
        	if(count[i]%2!=0) {
        		answer++;
        	}
        }
        System.out.println(Arrays.toString(count));
        
        
        return answer;
    }
	
	

}
