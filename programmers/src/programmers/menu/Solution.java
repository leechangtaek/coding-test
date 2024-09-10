package programmers.src.programmers.menu;

import java.util.*;

public class Solution {

	
	public static void main(String[] args) {
		Solution s = new Solution();
		

		String [] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int [] course = {2,3,4};

		System.out.println(s.solution(orders,course));
	}
	List<String> answerList = new ArrayList<>();
	HashMap<String,Integer> hm = new HashMap<>();

	public String[] solution(String[] orders, int[] course) {
		//1.각 order 정렬
		for(int i=0; i<orders.length; i++){
			char[] arr = orders[i].toCharArray();
			Arrays.sort(arr);
			orders[i] = String.valueOf(arr);
		}
		//2.각 order를 기준으로 courselength만큼의 조합 만들기
		for(int courseLength : course){
			for(String order : orders){
				combination("",order,courseLength);
			}
			//3.가장 많은 조합을 answer에 저장한다.
			if(!hm.isEmpty()){
				List<Integer> countList = new ArrayList<>(hm.values());
				System.out.println(countList);
				int max = Collections.max(countList);

				if(max > 1){
					for(String key : hm.keySet()){
						if(hm.get(key) == max){
							answerList.add(key);
						}
					}
				}
				hm.clear();
			}
		}
		Collections.sort(answerList);
		String [] answer = new String[answerList.size()];
		for (int i=0;i<answerList.size(); i++) {
			answer[i] = answerList.get(i);
			System.out.println(answer[i]);
		}

	return answer;
	}

	private void combination(String order, String others, int count) {
		//탈출조건
		if (count == 0){
			hm.put(order,hm.getOrDefault(order,0)+1);
			return;
		}
		//수행동작 : 0부터 length까지 조합
		for(int i=0; i<others.length(); i++){
			combination(order+others.charAt(i),others.substring(i+1),count-1);
		}
	}
}
