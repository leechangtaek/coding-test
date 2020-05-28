package katalk0518.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령의 개수를 입력하시오");
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			System.out.println("명령을 입력하시오");
			String input = sc.next();
			if(input.contains("push")) {
				System.out.println("수를 입력하시오");
				int count = sc.nextInt();
				stack.push(count);
			}else if(input.contains("pop")) {
				System.out.println(stack.isEmpty()?-1:stack.pop());
			}else if(input.contains("size")) {
				System.out.println(stack.size());
			}else if(input.contains("empty")) {
				System.out.println(stack.isEmpty()?1:0);
			}else if(input.contains("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());
			}else {
				System.out.println("다시 입력해주세요");
				return;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
