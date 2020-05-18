package programmers.prices;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		int a[] = {1,2,3,2,3};
		
		System.out.println("결과:"+Arrays.toString(s.solution(a)));//[4, 3, 1, 1, 0]
		
	}
	public int[] solution(int [] prices) {
		int[] answer = new int[prices.length];
		
		for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]>prices[j]){
                    answer[i]=j-i;
                    break;
                }else {
                	answer[i]=j-i;
                }
            }
        }
		
		return answer;
	}

}
