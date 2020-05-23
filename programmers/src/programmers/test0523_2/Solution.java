package programmers.test0523_2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		long a = 4;
		long b = 11;
		
		
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	ArrayList<Integer> sumArr = new ArrayList<>();
	public long solution(long p) {
		long answer = 0;
		int [] arr = new int[(int) p];
		
		
		for(int i=0; i<p; i++) {
			arr[i] =(int) Math.pow(3, i);
		}
		getAllSums(arr,0,0);
		ArrayList<Integer> answer1 = new ArrayList<>();
		Collections.sort(sumArr);
		System.out.println(sumArr);
		
		for(Integer data : sumArr){
		    if(!answer1.contains(data))
		        answer1.add(data);
		}
		answer1.remove(0);

		
		System.out.println(answer1);
	    answer = answer1.get((int) p-1);
		
		
		return answer;
		
	}
	public void getAllSums(int[] numbersArray, int starting, int sum)
	{   
	       if(numbersArray.length == starting)
	       {      
	           sumArr.add(sum);    
	           return;
	       }
	       int value = sum + numbersArray[starting];
	       getAllSums(numbersArray, starting + 1, value);
	       getAllSums(numbersArray, starting + 1, sum); 
	}
	

}
