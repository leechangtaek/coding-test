package programmers.src.programmers.orange;

import java.util.*;

public class solution {
    public static void main(String[] args) {
        int answer = 0;
        int k =6;
        int tangerine[] = {1, 3, 2, 5, 4, 5, 2, 3};

        Map<Integer, Integer> mp = new HashMap<>();
        for(int a :tangerine) {
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }


        List<Integer> li = new ArrayList<>(mp.values());
        Collections.sort(li,Collections.reverseOrder());


        for(int i=0; i<li.size(); i++) {
            if(k>0) {
                k-=li.get(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
