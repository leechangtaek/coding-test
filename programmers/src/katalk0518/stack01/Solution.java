package katalk0518.stack01;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령의 수를 입력하시오");
		int cnt = sc.nextInt();
		String answer = "YES";
		
		for(int i=0; i<cnt; i++) {
			System.out.println("괄호를 입력하세오");
			String input = sc.next();
			Stack stack = new Stack<>();
			
			for(int j=0; j<input.length(); j++) {
				if(input.charAt(j)=='(') {
					stack.push(1);
				}else if(input.charAt(j)==')') {
					if(stack.isEmpty()) {
						answer="NO";
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty()) {
				answer="NO";
			}
			System.out.println(answer);
		}
	}

}
