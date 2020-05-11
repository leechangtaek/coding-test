package programmers.arrayRotated;
/*
 * 오름차순으로 정렬된 배열이 미리 알 수 없는 피벗에서 회전한다고 가정해 보십시오.

(즉, [0,1,2,4,5,6,7]이(가) [4,5,6,7,0,1,2]가 될 수 있다.)

검색할 대상 값이 주어진다. 어레이에 있는 경우 인덱스를 반환하고, 그렇지 않으면 -1을 반환하십시오.

배열에 중복이 없다고 가정할 수 있다.

알고리즘의 런타임 복잡성은 O(log n)의 순서에 따라야 한다.
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a []= {4,5,6,7,0,1,2};
		int b = 0;
		//4
		
		
		int c []= {4,5,6,7,0,1,2};
		int d = 3;
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(c, d));
		
		//-1
	}
	
	public int solution(int []nums, int target) {
		int answer = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(target ==nums[i]) {
				answer = i;
				return answer;
			}else {
				answer=-1;
			}
		}
		return answer;
		
	}

}
