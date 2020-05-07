package programmers.test01;

import java.util.Scanner;

public class Solution {

	Scanner sc = new Scanner(System.in);
	
	
	//자물쇠 문제
	public int solution(String p, String s) {
		
		int answer =0;
		
		int a[] = new int[p.length()];
		int b[] = new int[s.length()];
		
		for(int i=0; i<p.length(); i++) {
			a[i] = p.charAt(i)-'0';
		}
		for(int i=0; i<s.length(); i++) {
			b[i] = s.charAt(i)-'0';
		}
		for(int i=0; i<p.length(); i++) {
			if(Math.abs(a[i]-b[i])>5) {
				if(a[i]<b[i]) {
					a[i]+=10;
				}else if(a[i]>b[i]) {
					b[i]+=10;
				}
			}
			answer+= Math.abs(a[i]-b[i]);
			System.out.println(Math.abs(a[i]-b[i]));
		}
		System.out.println(answer);
		return answer;
		
		
	}
}

