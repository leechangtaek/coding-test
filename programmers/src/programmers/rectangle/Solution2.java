package programmers.rectangle;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int a[][] = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int b[][] = {{0,0,1,1},{1,1,1,1}};
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	public int solution(int [][] board) {
		int answer= 0;
		
		int arr [][] = new int[board.length+1][board[0].length+1];
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==1) {
					arr[i+1][j+1] =1;
				}else {
					arr[i+1][j+1] =0;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				if(arr[i][j]==1) {
					int min = Math.min(Math.min(arr[i][j-1], arr[i-1][j]), arr[i-1][j-1]);
					
					arr[i][j]= min+1;
					answer = Math.max(answer, arr[i][j]);
				}
			}
		}
		
		return answer*answer;
	}

}
