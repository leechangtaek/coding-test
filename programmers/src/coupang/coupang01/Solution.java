package coupang.coupang01;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int a [][] = {{19800,40,5,100,30,1200,22},{27500,60,4,150,20,2000,25},{39600,200,3,100,40,6000,21},{50000,200,3,-1,0,6000,21}};
		int b [][] = {{70,165,2020},{42,110,1205},{100,120,6100},{100,999,6100},{80,130,3500}};
		
		int c [][] = {{19800,40,5,100,30,-1,0},{27500,-1,0,150,20,2000,20},{100000,-1,0,-1,0,-1,0}};
		int d [][] = {{70,160,9920},{800,620,9100},{900,200,500}};
		
		System.out.println("결과:"+s.solution(a, b));
		System.out.println("결과:"+s.solution(c, d));
	}
	
	public int solution(int [][]rates, int [][] customers) {
		int answer = 0;
		int result = 0;
		int flag = 0;
		for(int i=0; i<customers.length; i++) {
			flag = 0;
			for(int j=0; j<rates.length; j++) {
				result=0;
				result += rates[j][0];
				if(rates[j][1]==-1) {
					rates[j][2]=0;
				}
				if(rates[j][3]==-1) {
					rates[j][4]=0;
				}
				if(rates[j][5]==-1) {
					rates[j][6]=0;
				}
				if(customers[i][0]>rates[j][1]) {
					result+=(customers[i][0]-rates[j][1])*rates[j][2]*60;
				}
				if(customers[i][1]>rates[j][3]) {
					result+=(customers[i][1]-rates[j][3])*rates[j][4];
				}
				if(customers[i][2]>rates[j][5]) {
					result+=(customers[i][2]-rates[j][5])*rates[j][6];
				}
				if(flag==0) {
					flag=result;
				}
				if(flag>result) {
					flag=result;
				}
			}
			answer += flag;
		}
		
		return answer;
	}

}
