package programmers.src.programmers.clothesSpy;
/*
 * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 
긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 */
import java.util.HashMap;

public class Solution3 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();

		String a [][] = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};//5
		/**
		 * headgear - yellow_hat, green_turban, none
		 * eyewer - blue_sunglasses, none
		 */
		String b [][]= {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};//3
		System.out.println("결과:"+s.solution(a));
		System.out.println("결과:"+s.solution(b));
	}
	 public int solution(String[][] clothes) {
		 int answer = 1;
		
		 
		 HashMap<String,Integer> hm = new HashMap<>();
		 
		 for(int i=0; i<clothes.length; i++){
			 hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1],0)+1);
		 }
		 System.out.println("hm = " + hm);
		 for(String s : hm.keySet()){
			 answer *= hm.get(s)+1;
		 }
		 answer -= 1;
		 
		 return answer;
	 }

}
