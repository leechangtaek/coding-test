package programmers.participant;

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
