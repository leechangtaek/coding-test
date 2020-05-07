package programmers.test6;
/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.

	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class Solution {

	//자릿수 더하기
	public static void main(String[] args) {
		Solution s = new Solution();
		int a = 123;
		int b = 987;
		
		System.out.println("결과:"+s.plus(a));
		System.out.println("결과:"+s.plus(b));
	}
	
	public int plus(int n) {
		int answer = 0;
		
		while(n!=0) {
			answer+=n%10; //나머지값
			n/=10; //몫값
		}
		
		
		return answer;
	}
}
