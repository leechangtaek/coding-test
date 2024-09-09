package programmers.src.programmers.phoneNumber;

import java.util.Arrays;

/*
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 */
public class Solution2 {

	public static void main(String[] args) {

		Solution2 s= new Solution2();
		String [] a = {"119", "97674223", "1195524421"};
		String [] b = {"123","456","789"};
		String [] c = {"12","123","1235","567","88"};
		
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));
	}
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		//1.phone_book을 정렬한다.
		Arrays.sort(phone_book);
		//2. 1중 loop를 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
		for(int i=0; i<phone_book.length-1; i++){
			if(phone_book[i+1].startsWith(phone_book[i])){
				return false;
			}
		}
		//3. 여기까지 오지 못했다면 접두어가 없다는것입니다.
	     return answer;
	}

}
