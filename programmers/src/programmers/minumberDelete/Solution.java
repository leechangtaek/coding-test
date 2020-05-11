package programmers.minumberDelete;
/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다. 
 */
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int [] a = {4,3,2,1};
		int [] b = {10};
		
		System.out.println("결과:"+Arrays.toString(s.solution(a)));
		System.out.println("결과:"+Arrays.toString(s.solution(b)));
	}
	public int[] solution(int [] arr ) {
		
		if(arr.length<=1) {
			int [] answer = {-1};
			return answer;
		}
		int[] answer = new int[arr.length-1];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<answer.length; i++) {
			answer[i]= arr[i];
		}
		
		return answer;
	}
}
