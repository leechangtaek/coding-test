package wincube.win02;

import java.util.HashMap;
import java.util.Map;
/*
 * 짧은 시간안에 당첨된 사람 없으면 -1
 */
public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a[] = {2, 1, 3, 1, 4, 2, 1, 3};
		int b[] = {1, 2, 3};
		int c[] = {1, 2, 3, 4, 5, 1, 3, 5};
		int d[] = {1, 2, 3, 4, 5};
		int e[] = {1, 2, 3, 4, 5,1,2,3,4,5};
		int f[] = {1,1,1,1,1};
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));
		System.out.println("결과:"+s.solution(d));
		System.out.println("결과:"+s.solution(e));
		System.out.println("결과:"+s.solution(f));
	}
	public int solution(int[] arr) {
//		int answer = 0;
//		LinkedList<Integer> li = new LinkedList<>();
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					li.add(j-i);
//				}
//			}
//		}
//		Collections.sort(li);
//		if(li.isEmpty()) {
//			answer=-1;
//		}else {
//			answer=li.get(0);
//		}
//		System.out.println(li);
//		
//		
//		return answer;
		
		int answer = -1;

		Map<Integer,Integer> map = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) == null) {
				map.put(arr[i], i);
			}else {
				int n = map.get(arr[i]);
				if(min > i-n) {
					min = i - n;
				}else {
					map.put(arr[i], i);
				}
			}
		}
		System.out.println(map);
		if(min != Integer.MAX_VALUE) {
			answer = min;
		}

		return answer;
		
    }
	
	

}
