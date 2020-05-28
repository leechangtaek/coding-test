package coupang.coupang03;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a = 3;
		int b = 2;
		
		int c = 4;
		int d = 2;
		
		int e = 6;
		int f = 3;
		
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(c, d));
		System.out.println("결과:"+s.solution(e, f));
	}
	public long solution(int N, int K) {
		long answer = 0;
		String s = new String();
		String s1 = new String();
		
		for(int i=0; i<N; i++) {
			s+="1";
			s1+="0";
		}
		
		int a = Integer.parseInt(s,2);
		int a1 = Integer.parseInt(s1,2);
		
		for(int i=a1; i<=a; i++) {
			if(K==Integer.bitCount(i) && i%3==0) {
				answer++;
			}
		}
		return answer;
	}

}
