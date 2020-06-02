package programmers.dfs;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a[] = {1,1,1,1,1};
		int b = 3;
		
		System.out.println("결과:"+s.solution(a, b));
		
	}
	public int solution(int [] numbers, int target) {
		int answer = 0;
		
		answer = dfs(numbers, 0, 0, target);
		System.out.println(numbers.length);
		
		return answer;
	}
	private int dfs(int[] numbers, int node, int sum, int target) {
		if(node==numbers.length) {
			if(sum==target) {
				return 1;
			}else {
				return 0;
			}
		}
		return dfs(numbers,node+1, sum+numbers[node], target)+
				dfs(numbers,node+1, sum-numbers[node], target);
	}
}
