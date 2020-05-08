package programmers.test12;
/*
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 
 * 예를 들어
	()() 또는 (())() 는 올바른 괄호입니다.
	)()( 또는 (()( 는 올바르지 않은 괄호입니다.
	'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 
	올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 */
public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String a = "()()";
		String b = "(())()";
		String c = ")()(";
		String d = "(()(";
		String e = "(()";
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));
		System.out.println("결과:"+s.solution(d));
		System.out.println("결과:"+s.solution(e));
		
	}
	
	public boolean solution(String a) {
		boolean answer = true;
		int open = 0;
		char arr[] = a.toCharArray();
		
		if(arr[0]==')' || arr[arr.length-1]=='(') {
			return false;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='(') {
				open++;
			}else {
				open--;
			}
		}
		if(open==0) {
			return answer;
		}else {
			return false;
		}
		
	}

}
