package coupang.coupang02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String[] a = {"[403]James", "[404]Azad,Louis,Andy","[101]Azad,Guard"};
		int b = 403;
		//Andy, Louis, Guard, Azad
		String[] c = {"[101]Azad,Guard", "[202]Guard","[303]Guard,Dzaz"};
		int d = 202;
		//Azad, Dzaz
		
		String[] e = {"[1234]None,Of,People,Here", "[5678]Wow"};
		int f = 1234;
		//Wow
		
		System.out.println("결과:"+Arrays.toString(s.solution(a, b)));
		System.out.println("결과:"+Arrays.toString(s.solution(c, d)));
		System.out.println("결과:"+Arrays.toString(s.solution(e, f)));
		
	}
	public String[] solution(String[] rooms, int target) {
		String[] answer = {};
		int [] arr = new int[rooms.length];
		String[] sArr = new String [rooms.length];
		List<Integer> li = new ArrayList<>();
		List<String> sli = new ArrayList<>();
		List<String> noR = new ArrayList<>();
		String bArr = "";
		for(int i=0; i<rooms.length; i++) {
			//절대값
			li.add(Math.abs(Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf("]")))-target));
			//이름만
			sli.add(rooms[i].substring(rooms[i].indexOf("]")+1,rooms[i].length()));
		}
		for(int i=0; i<li.size(); i++) {
			if(li.get(i) ==0) {
				noR.add(sli.get(i));
				li.remove(i);
				sli.remove(i);
			}
		}
//		System.out.println(noR);
//		System.out.println(li);
//		System.out.println(sli);
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
		for(int i=0; i<li.size(); i++) {
			if(sli.get(i).contains(",") ) {
				String name [] = {};
				name=sli.get(i).split(",");
				Arrays.sort(name);
				for(int j=0; j<name.length; j++) {
					for(int k=0; k<noR.size(); k++) {
						if(!noR.get(k).contains(name[j])) {
							hm.put(name[j], hm.getOrDefault(name[j], 0)+1);
						}
						
					}
				}
			}else {
				hm.put(sli.get(i), 0);
			}
		}
		List<String> keySetList = new ArrayList<>(hm.keySet());
		Collections.sort(keySetList, (o1, o2) -> (hm.get(o1).compareTo(hm.get(o2))));
		System.out.println(keySetList);
		answer = new String[keySetList.size()];
		for(int i=0; i<keySetList.size(); i++) {
			answer[i] = keySetList.get(i);
		}
//		System.out.println(hm);
//		String answer2 = "";
//		for(String key: hm.keySet()) {
//			answer2 = hm.get(key)+",";
//		}
		
		
		
		
		return answer;
		
		
		
	}

}
