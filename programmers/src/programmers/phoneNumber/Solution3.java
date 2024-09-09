package programmers.src.programmers.phoneNumber;

import java.util.Arrays;
import java.util.HashMap;

/*
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 */
public class Solution3 {

	public static void main(String[] args) {

		Solution3 s= new Solution3();
		String [] a = {"119", "97674223", "1195524421"};
		String [] b = {"123","456","789"};
		String [] c = {"12","123","1235","567","88"};
		
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));
	}
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		//1.hashMap을 만든다.
		HashMap<String,Integer> mp = new HashMap<>();
		for (String s : phone_book) {
			mp.put(s,1);
		}

		System.out.println(mp);
		//2.모든 전화번호의 접두어가 HashMap에 있는지 확인한다.
		for(int i=0; i< phone_book.length; i++){
			for(int j=1; j<phone_book[i].length(); j++){
				if(mp.containsKey(phone_book[i].substring(0,j))){
					return false;
				}
			}
		}

		//3여기까지 왔다면 접두어가 없다는것이다.

	     return answer;
	}

}
