package programmers.src.kakao.kakao03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int a = 3;
		String [] b = {"Jeju", "Pangyo","Seoul","NewYork","LA","Jeju","Pangyo","Seoul","NewYork","LA"}; //50
		
		int a1 = 3;
		String [] b1 = {"Jeju", "Pangyo","Seoul","Jeju", "Pangyo","Seoul","Jeju", "Pangyo","Seoul"};//21
		
		int a2 = 2;
		String [] b2 = {"Jeju", "Pangyo","Seoul","NewYork","LA","SanFrancisco","Seoul","Rome","Paris","Jeju","NewYork","Rome"};//60
		
		int a3 = 5;
		String [] b3 = {"Jeju", "Pangyo","Seoul","NewYork","LA","SanFrancisco","Seoul","Rome","Paris","Jeju","NewYork","Rome"};//52
		
		int a4 = 2;
		String [] b4 = {"Jeju", "Pangyo","NewYork","newyork"};//16
		
		int a5 = 0;
		String [] b5 = {"Jeju", "Pangyo","Seoul","NewYork","LA"};//25
		
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(a1, b1));
		System.out.println("결과:"+s.solution(a2, b2));
		System.out.println("결과:"+s.solution(a3, b3));
		System.out.println("결과:"+s.solution(a4, b4));
		System.out.println("결과:"+s.solution(a5, b5));
		
	}
	public int solution(int size, String[] city) {
		int answer = 0;
		Queue<String> que = new LinkedList<>();
		
		int count =0;
		for(int i=0; i<city.length; i++) {
			if(count!=size) {
				que.add(city[i].toUpperCase());
				count++;
				answer+=5;
			}else {
				if(que.contains(city[i].toUpperCase())) {
					answer+=1;
				}else {
					answer+=5;
				}
				que.poll();
				que.add(city[i].toUpperCase());
			}
		}
		
		return answer;
	}

}
