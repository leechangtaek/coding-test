package katalk0525.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령의 개수를 입력하시오");
		int cnt = sc.nextInt();
		int a = 0;
		
		for(int i=0; i<cnt; i++) {
			System.out.println("명령을 입력하시오.");
			String input = sc.next();
			switch(input) {
			case "push" : System.out.println("수를 입력하시오."); a = sc.nextInt(); que.add(a); break;
			case "pop" : System.out.println(que.isEmpty()?-1:que.poll()); break; //아에 제거 하면서 빼넴
			case "size" : System.out.println(que.size()); break;
			case "empty" : System.out.println(que.isEmpty()?1:0); break;
			case "front" : System.out.println(que.isEmpty()?-1:que.peek()); break;
			case "back" : System.out.println(que.isEmpty()?-1:a); break;
			}
		}
	}

}
