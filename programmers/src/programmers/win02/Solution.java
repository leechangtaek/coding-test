package programmers.win02;

import java.util.Arrays;

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
		
        int[] count = new int[arr.length];
        int flag= 0;
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]==arr[j]) {
        			count[i]=j-i;
        			break;
        		}
        	}
        }
        int answer = count[0];
        for(int i=0; i<arr.length; i++) {
        	if(count[i]!=0 && answer>count[i]) {
        		answer=count[i];
        	}
        	if(count[i]==0) {
        		flag++;
        	}
        }
        if(flag==count.length) {
        	answer=-1;
        }
        System.out.println(Arrays.toString(count));
        
        return answer;
    }
	
	

}
