package coupang.coupang02;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
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
		String bArr = "";
		for(int i=0; i<rooms.length; i++) {
			//절대값
			arr[i]=Math.abs(Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf("]")))-target);
			//이름만
			sArr[i]= rooms[i].substring(rooms[i].indexOf("]")+1,rooms[i].length());
		}
		//순서
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
					String temp1 = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = temp1;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(sArr));
		String noRoom = "";
		
		//다른방이름
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				
				if(sArr[i].contains(",")) {
					bArr+=sArr[i];
					if(i!=arr.length-1) {
						bArr+=",";
					}
				}else {
					bArr+=sArr[i];
				}
			}else {
				noRoom=sArr[i];
			}
		}
		System.out.println(bArr);
		System.out.println(noRoom);
//		System.out.println(noRoom);
		String name [] = {};
		for(int i=0; i<bArr.length(); i++) {
			name=bArr.split(",");
		}
		HashMap<String, Integer> map = new HashMap();
		for(String human : name) {
			map.put(human, map.getOrDefault(human, 0)+1);
			if(human.equals(noRoom)) {
				map.remove(noRoom);
			}
		}
		String answer1="";
		String[] answer2 = {};
		String answer3 = "";
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				answer1+=key+",";
			}
			answer2= answer1.split(",");
			Arrays.sort(answer2);
		}
		for(int i=0; i<answer2.length; i++) {
			answer3+=answer2[i];
			if(i!=answer2.length-1) {
				answer3+=",";
			}
		}
		for(String key : map.keySet()) {
			if(map.get(key)!=1) {
				answer3+=","+key;
			}
			answer=answer3.split(",");
		}
		
//		System.out.println(answer3);
//		System.out.println(Arrays.toString(answer));//절대값
//		System.out.println(map);
//		
//		System.out.println(Arrays.toString(arr));//절대값
//		System.out.println(Arrays.toString(sArr));//이름만
//		System.out.println(bArr);
//		System.out.println(Arrays.toString(name));//같은방이름
		
		return answer;
		
		
		
	}

}
