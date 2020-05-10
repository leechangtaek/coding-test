package programmers.fibonachi;

/*
 * 피보나치수열
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a = 3;
		int b = 7;
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	
	public int solution(int n) {
		int answer = 0;
		
		int a = 0;
		int b = 1;
		
		for(int i=2; i<n; i++) {
			answer = (a+b)%1234567;
			a = b%1234567;
			b=answer%1234567;
		}
		//1234567의 나머지는 나눈값
		return answer;
	}
	

}
