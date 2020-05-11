package programmers.coupang02;

import java.util.Arrays;

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
		
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(c, d));
		System.out.println("결과:"+s.solution(e, f));
		
	}
	public String[] solution(String[] rooms, int target) {
		String[] answer = {};
		
		int [] arr = new int[rooms.length];
		String[] sArr = new String [rooms.length];
		String[] bArr = {};
		for(int i=0; i<rooms.length; i++) {
			//절대값
			arr[i]=Math.abs(Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf("]")))-target);
			//이름만
			sArr[i]= rooms[i].substring(rooms[i].indexOf("]")+1,rooms[i].length());
			
			
		}
		for(int i=0; i<arr.length; i++) {
			Arrays.sort(arr);
		}
		//같은이름이나, 같은 방에 있는 이름을 빼야함
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				//같은방이름
				bArr=sArr[i].split(",");
			}
		}
//		for(int i=0; i<sArr.length; i++) {
//			if(arr[i]!=0) {
//				answer[i]=sArr[i];
//			}
//		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		return answer;
//		String []answer = {};
//		String[] answer11 = {};
//		String ansewr1 = new String();
//		int flag = 0;
//		int abs;
//		int j=0;
//		int [] roomnum = new int[rooms.length];
//		
//		for(int i=0; i<rooms.length; i++) {
//			if(Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')))-target>0) {
//				roomnum[j++]=Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')))-target;
//			}else {
//				roomnum[j++]=target-Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')));
//			}
//		}
//		for(int i=0; i<roomnum.length; i++) {
//			for(j=0; j<roomnum.length; j++) {
//				if(roomnum[i]<roomnum[j]) {
//					int tmp = roomnum[i];
//					roomnum[i]=roomnum[j];
//					roomnum[j]=tmp;
//				}
//			}
//		}
//		for(int i=0; i<roomnum.length; i++) {
//			for(j=0; j<rooms.length; j++) {
//				if(Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')))-target>0) {
//					abs=Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')))-target;
//				}else {
//					abs=target-Integer.parseInt(rooms[i].substring(1,rooms[i].indexOf(']')));
//				}
//				if(roomnum[i]!=0&&abs==roomnum[i]) {
//					answer11= rooms[i].substring(rooms[i].indexOf(']')+1).split(",");
//					ansewr1+=","+(rooms[i].substring(rooms[i].indexOf(']')+1));
//					continue;
//				}
//			}
//			answer=ansewr1.split(",");
//		}
//		System.out.println(Arrays.toString(answer11));
//		
//		return answer;
		
	}

}
