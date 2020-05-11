package programmers.nara123;

public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println("결과:"+s.solution(1));
		System.out.println("결과:"+s.solution(2));
		System.out.println("결과:"+s.solution(3));
		System.out.println("결과:"+s.solution(4));
		System.out.println("결과:"+s.solution(6));
		System.out.println("결과:"+s.solution(7));
		System.out.println("결과:"+s.solution(10));
		
	}
	public String solution(int n) {
		String answer = "";
		int a = 0;
		int b = 0;
		
		while(n>0) {
			a = n%3;//나머지
			n = n/3;//몫
			
			if(a%3==0) {
				n-=1;
				a=4;
			}
			answer = a+answer;
		}
	
		return answer;
	}

}
