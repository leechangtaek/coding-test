package programmers2.test;

import java.util.Arrays;

/*
 * 땅따먹기 게임을 하려고 합니다. 땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고, 
 * 모든 칸에는 점수가 쓰여 있습니다. 1행부터 땅을 밟으며 한 행씩 내려올 때, 
 * 각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다. 
 * 단, 땅따먹기 게임에는 한 행씩 내려올 때, 
 * 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a[][] = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		System.out.println("결과:"+s.solution(a));
	}
	public int solution(int[][] land) {
		int answer = 0;
		
		//직관적인 방법
//		for(int i=1; i<land.length; i++) {
//			land[i][0]+=Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
//			land[i][1]+=Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
//			land[i][2]+=Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
//			land[i][3]+=Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
//		}
//		answer = Math.max(land[2][0], Math.max(land[2][1], Math.max(land[2][2], land[2][3])));
		
		for(int i=1; i<land.length; i++) {
			for(int j=0; j<land[0].length; j++) {
				int sum=0;
				for(int k=0; k<land[0].length; k++) {
					if(j==k) {
						continue;
					}else {
						sum=Math.max(sum, land[i-1][k]);
					}
				}
				land[i][j]+=sum;
			}
		}
		System.out.println(Arrays.deepToString(land));
		Arrays.sort(land[land.length-1]);
		System.out.println(Arrays.deepToString(land));
		answer = land[land.length-1][land[0].length-1];
		
		
		return answer;
	}

}
