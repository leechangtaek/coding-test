package programmers.maxminNumber;
/*
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요. 

	예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다. 
 */
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s= new Solution();
		String a = "1 2 3 4";
		String b = "1 -2 -3 -4";
		String c = "-1 -1";
		
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
		System.out.println("결과:"+s.solution(c));
		
	}
	public String solution(String s) {
		String answer = "";
		
		String [] a =s.split(" ");
		System.out.println(Arrays.toString(a));
		int [] arr = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			arr[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		answer = arr[0]+" "+arr[arr.length-1];
		
		
		return answer;
	}

}
