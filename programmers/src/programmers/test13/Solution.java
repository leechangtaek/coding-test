package programmers.test13;
/*
 * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다. 

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다. 

조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다. 

조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다. 

예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다. 

​

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

 */
public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int a = 78;
		int b = 15;
		String a1 = "1234/";
		System.out.println(a1.indexOf("/"));
//		System.out.println("결과:"+s.solution(a));
//		System.out.println("결과:"+s.solution(b));
	}
	public int solution(int n) {
		int count = Integer.bitCount(n); // n을 이진수 한다음에 1의갯수 4개
		String aa = Integer.toBinaryString(n); // n을 이진수한거  1001110
//		System.out.println(aa);
//		System.out.println(count);
		
		for(int i=n+1; ; i++) {
			int count1 = Integer.bitCount(i);
			if(count == count1) {
				return i;
			}
		}
		
		
	}

}
