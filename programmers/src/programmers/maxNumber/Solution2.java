package programmers.maxNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String a = "1924";
		int a1 = 2;
		String b = "1231234";
		int b1 = 3;
		String c = "4177252841";
		int c1 = 4;
		
		System.out.println("결과:"+s.solution(a, a1));
		System.out.println("결과:"+s.solution(b, b1));
		System.out.println("결과:"+s.solution(c, c1));
	}
	
	
	public String solution(String number, int k) {
		String answer ="";
		
		int delC = 0;
		int index = 1;
		
		List<Integer > li = new ArrayList<>();
		
		for(int i=0; i<number.length(); i++) {
			li.add(Integer.parseInt(number.charAt(i)+""));
		}
		System.out.println(li);
		while(delC !=k) {
			if(index>=1 && li.get(index-1)<li.get(index)) {
				li.remove(index-1);
				delC++;
				index--;
			}
			else {
				if(index==li.size()-1 && li.get(index)<=li.get(index-1)) {
					li.remove(index);
					delC++;
					index--;
				}else {
					index++;
				}
			}
		}
		System.out.println(li);
		for(int i=0; i<li.size(); i++) {
			answer+=li.get(i);
		}
		return answer;
	}

}
