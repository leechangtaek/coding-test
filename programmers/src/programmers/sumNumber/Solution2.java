package programmers.sumNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int a = 123;
		int b = 987;
		int c = 981231237;
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));

	}
	public int solution(int a) {
		int answer =0 ;
		
		String st = a+"";
		System.out.println(st);
		List<Integer> li = new ArrayList<>();
		
		for(int i=0; i<st.length(); i++) {
			li.add(Integer.parseInt(st.charAt(i)+""));
			answer+=li.get(i);
		}
		System.out.println(li);
		
		
		
		
		
		return answer;
	}

}
