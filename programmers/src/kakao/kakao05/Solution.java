package kakao.kakao05;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int b[] = {1,5,3,5,1,2,1,4};
		
		System.out.println("결과:"+s.solution(a, b));
	}
	public int solution(int [][] board, int[] moves) {
		int answer= 0 ;
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1]!=0) {
					if(st.isEmpty()) {
						st.push(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
						break;
					}
					if(board[j][moves[i]-1]==st.peek()) {
						st.pop();
						answer+=2;
					}else {
						st.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1]=0;
					break;
				}
			}
		}
		
		return answer;
	}

}
