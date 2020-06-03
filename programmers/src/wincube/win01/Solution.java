package wincube.win01;

import java.util.Arrays;

/*
 * 알파벳의 개수가 홀수개인 알파벳의 개수
 */
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
        
        //알파벳을 배열에 담기
        for(int i=0; i<alpha.length; i++) {
        	alpha[i] = (char)(i+97);
        }
        System.out.println(Arrays.toString(alpha));
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
