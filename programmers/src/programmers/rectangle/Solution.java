package programmers.rectangle;

import java.util.Arrays;

/*
 * 문제 설명(가장 큰 정사각형 찾기) 
 * 1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
 * 표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a[][] = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int b[][] = {{0,0,1,1},{1,1,1,1}};
		
		System.out.println("결과:"+s.rectangle(a));
		System.out.println("결과:"+s.rectangle(b));
	}
	
	public int rectangle(int [][]board) {
		int answer = 0;
		int [][] arr = new int[board.length+1][board[0].length+1];
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==1) {
					arr[i+1][j+1]=1;
				}else {
					arr[i+1][j+1]=0;
				}
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				if(arr[i][j]==1) {
					int min= Math.min(arr[i-1][j], arr[i][j-1]);
					min = Math.min(arr[i-1][j-1], min);
					
					arr[i][j]=min+1;
					answer = Math.max(answer, arr[i][j]);
				}
				System.out.println(answer);
			}
		}
		
		
		System.out.println(Arrays.deepToString(board));
		
		return answer*answer;
	}
}
