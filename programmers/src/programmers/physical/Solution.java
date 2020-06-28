package programmers.physical;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int n = 5;
		int lost[] = {2,4};
		int reserve[] = {1,3,5};
		
		int n1 = 5;
		int lost1[] = {2,4};
		int reserve1[] = {3};
		
		int n2 = 3;
		int lost2[] = {3};
		int reserve2[] = {1};
		
		System.out.println(s.solution(n, lost, reserve));
		System.out.println(s.solution(n1, lost1, reserve1));
		System.out.println(s.solution(n2, lost2, reserve2));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
//        List<Integer> li = new ArrayList<>();
//        List<Integer> li2 = new ArrayList<>();
//        for(int i=0; i<lost.length; i++) {
//        	li.add(lost[i]);
//        }
//        for(int i=0; i<reserve.length; i++) {
//        	li2.add(reserve[i]);
//        }
//        answer = n-lost.length;
//        for(int i=0; i<li.size(); i++) {
//        	for(int j=0; j<li2.size(); j++) {
//        		if(li.get(i)==li2.get(j)+1 || li.get(i)==li2.get(j)-1) {
//        			li.remove(i);
//        			li2.remove(j);
//        		}
//        	}
//        }
//        
//        answer = n-li.size();
        
        answer = n;
        for(int i = 0; i < lost.length; i++) {
            boolean rent = false;
            int j = 0;
            
            while(!rent) {
                if(j == reserve.length) {
                	break;
                }
                if(lost[i] == reserve[j]){
                	reserve[j] = -1; rent=true;
                }
                else if(lost[i] - reserve[j] == 1 ){
                	reserve[j] = -1; rent=true;
                }
                else if(lost[i] - reserve[j] == -1){
                	reserve[j] = -1; rent=true;
                }
                else{
                	j++;                      
                }
            }
            if(!rent) answer--;
        }
        return answer;
    }
}
