package programmers.test0523_1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int a = 1987;
		int b = 2015;
		
		
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	public int solution(int p) {
		int answer = 0;
		
		for(int i=p+1; ; i++) {
			String a = i+"";
			int count = 0;
			for(int j=0; j<a.length(); j++) {
				for(int k=j+1; k<a.length(); k++) {
					if(a.charAt(j)==a.charAt(k)) {
						count++;
					}
				}
			}
			if(count==0) {
				return i;
			}else {
				continue;
			}
		}
		
	}
	

}
