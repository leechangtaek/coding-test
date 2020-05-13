package programmers.participant;
/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		String a[] = {"leo", "kiki", "eden"};
		String b[] = {"eden","kiki"};
		
		String c[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String d[] = {"josipa", "filipa", "marina", "nikola"};
		
		String e[] = {"mislav", "stanko", "mislav", "ana"};
		String f[] = {"stanko", "ana", "mislav"};
		
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(c, d));
		System.out.println("결과:"+s.solution(e, f));
		
		
	}
	public String solution(String[] participant , String [] completion) {
//		String answer = "";
//		HashMap map = new HashMap();
//		for(int i=0; i<participant.length; i++) {
//			map.put(i, participant[i]);
//		}
//		HashMap cMap = new HashMap();
//		for(int i=0; i<completion.length; i++) {
//			cMap.put(i, completion[i]);
//		}
//		for(int i=0; i<participant.length; i++) {
//			for(int j=0; j<completion.length; j++) {
//				if(map.get(i)==null) {
//					break;
//				}
//				if(map.get(i).equals(cMap.get(j))) {
//					map.remove(i);
//					cMap.remove(j);
//				}
//			}
//		}
//		System.out.println(map);
//		for(int i=0; i<participant.length; i++) {
//			if(map.get(i)!=null) {
//				answer = (String) map.get(i);
//			}
//		}
//		
//		
//		return answer;
		
		
		//HashMap 안쓰고한거
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		int i;
//		for(i=0; i<completion.length; i++) {
//			if(!participant[i].equals(completion[i])) {
//				return participant[i];
//			}
//		}
//		
//		
//		return participant[i];
		
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for(String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0)+1); //getOrDefault : 찾는키가 존재한다면 키를 반환하고 없으면 0
		}
		for(String player : completion) {
			hm.put(player, hm.get(player)-1); 
		}
		for(String key : hm.keySet()) { //keySet : 키값만 가져오는거.
			if(hm.get(key)!=0) {
				answer = key; 
			}
		}
		
		
		return answer;
				
	}

}
