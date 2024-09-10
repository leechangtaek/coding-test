package programmers.src.programmers.physical;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
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

		Set<Integer> lostSet = new HashSet<>();
		Set<Integer> reserveSet = new HashSet<>();

		for (int i : reserve) {
			reserveSet.add(i);
		}
		for (int i : lost) {
			if(reserveSet.contains(i)){
				reserveSet.remove(i);
			}else{
				lostSet.add(i);
			}
		}

		for(int i : reserveSet){
			if(lostSet.contains(i-1)){
				lostSet.remove(i-1);
			}else if(lostSet.contains(i+1)){
				lostSet.remove(i+1);
			}
		}
		answer = n - lostSet.size();
        return answer ;
    }
}
