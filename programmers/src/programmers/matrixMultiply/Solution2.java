package programmers.matrixMultiply;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		
		int a [][] ={{1,4},{3,2},{4,1}};
		int b [][] ={{3,3},{3,3}};
		
		int c [][] = {{2,3,2},{4,2,4},{3,1,4}};
		int d [][] = {{5,4,3},{2,4,1},{3,1,1}};
		System.out.println("결과 :"+Arrays.deepToString(s.solution(a,b)));
		System.out.println("결과 :"+Arrays.deepToString(s.solution(c,d)));
	}
	
	public int[][] solution(int [][] arr1, int [][] arr2) {
		int answer [][] = new int [arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				int temp=0;
				for(int k=0; k<arr1[0].length; k++) {
					temp+=arr1[i][k]*arr2[k][j];
				}
				answer[i][j]= temp;
			}
		}
		
		
		
		
		return answer;
	}

}
