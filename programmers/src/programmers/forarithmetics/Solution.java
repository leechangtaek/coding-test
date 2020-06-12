package programmers.forarithmetics;

import java.util.TreeSet;

public class Solution {
	
    static int _N;
    TreeSet<Integer>[] dynamic;
    
    public static void main(String[] args) {
		Solution s = new Solution();
		
		int a = 5;
		int a1 = 12;
		
		int b = 2;
		int b1 = 11;
		
		System.out.println("결과:"+s.solution(a,a1)); //4
		System.out.println("결과:"+s.solution(b,b1)); //3
		
	}
    public int solution(int N, int number) {
    	int answer = 0;
    	_N = N;
    	
    	dynamic = new TreeSet[10];
    	for(int i =1 ; i<= 8; i++){
    		solve(i);
    		if (dynamic[i].contains(number)) return i;
    	}
    	return -1;
    }

    public TreeSet<Integer> solve(int n) {
        if ((dynamic[n]!=null) &&!dynamic[n].isEmpty()) return dynamic[n];//전에 있던 집합 찾기.
        int num = 0;
        for (int i = 0; i < n; i++) num = 10 * num + _N; // NNNN만들기.
        TreeSet<Integer> temp = new TreeSet<>();
        temp.add(num);
        for(int i =1; i<n;i++){
            int j = n-i;
            System.out.println(j);
            TreeSet<Integer> from = solve(i);
            TreeSet<Integer> to = solve(j);
            for(int n1:from) {
                for (int n2 : to) {//d[n] = d[n-1] + d[i];
                    temp.add(n1 + n2);
                    temp.add(n1 - n2);
                    temp.add(n1 * n2);
                    if(n2 != 0) temp.add(n1 / n2);
                }
            }
            System.out.println(temp);
        }
        return dynamic[n]= temp;
    }


}
