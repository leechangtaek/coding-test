package programmers.win03;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		String a = "abab";
		String b = "abcde";

		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	public int solution(String plain) {
		int answer = 0;
		for(int i=0; i<plain.length(); i++) {
			if(palindrom(plain.substring(i))) {
				return i+plain.length();
			}
		}
		answer = plain.length()*2;
		return answer;
	}
	private boolean palindrom(String st) {
		for(int i=0; i<st.length(); i++){
			if(st.charAt(i)!=st.charAt(st.length()-i-1)) {
				return false;
			}
		}
		return true;
	}


}
/**
 * private static int getResult(String input_Str) {
		// 팰린드롬을 완성시키는 최소의 문자 개수 리턴
		// input_Str을 받아서 0번 인덱스부터 부분적으로 팰린드롬인지 검사한다
		// 0번 인덱스부터 팰린드롬이라면 문자를 추가할 필요가 없다 (그 자체가 팰린드롬)
		// 0번 인덱스부터 팰린드롬이 아니라면 팰린드롬이 완성되는 문자열 이전에 있던 팰린드롬이 아닌 문자열을 뒤에 대칭시키면 팰린드롬이 완성된다
		// 마지막 인덱스까지 팰린드롬이 아니면 최악의 경우이므로, 2배를 하여 전체를 대칭시킨다

		int len = input_Str.length();
		for (int i = 0; i < len; i++) {
			if (isPalindrome(input_Str.substring(i))) {
				return i + len;
			}
		}
		return len * 2; // 결국 팰린드롬이 아닌 경우 
	}

	private static boolean isPalindrome(String input_Str) {
		// 팰린드롬인지 검사 하여 결과값을 리턴 
		int len = input_Str.length();
		for (int i = 0; i < len; i++) {
			if (input_Str.charAt(i) != input_Str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
[출처] 백준 1254: 팰린드롬 만들기 (java)|작성자 로키


 */
