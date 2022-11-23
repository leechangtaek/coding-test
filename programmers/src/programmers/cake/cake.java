package programmers.src.programmers.cake;

import java.util.*;

public class cake {
    public static void main(String[] args) {

        //int topping[] = {1,2,3,1,4};
        int topping[] = {1, 2, 1, 3, 1, 4, 1, 2};

        int length = topping.length;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        set.add(topping[0]);

        for (int i = 1; i < length; i++) { //key = 번호 , value = 개수
            map.put(topping[i], map.getOrDefault(topping[i], 0)+1);
        }
        int answer = 0;
        for (int i = 1; i < length; i++) {
            set.add( topping[i]);

            if ( map.get( topping[i]) == 1) {
                map.remove( topping[i]);
            } else {
                map.put( topping[i],  map.get( topping[i]) - 1);
            }
            if (set.size() == map.size()) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
