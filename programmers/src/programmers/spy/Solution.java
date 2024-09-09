package programmers.src.programmers.spy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();
        String [][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};


        System.out.println("결과:"+s.solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1;

        //1.옷을 종류별로 구분한다.
        HashMap<String,Integer> mp = new HashMap<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            mp.put(type,mp.getOrDefault(type,0)+1);
        }
        System.out.println(mp);

        //2.입지 않는 경우를 추가해서 모든 조합을 계산한다.
        Iterator<Integer> it = mp.values().iterator();

        while (it.hasNext()){
            answer *= it.next().intValue() +1;
        }
        //3.아무종류의 옷도 입지 않은 경우 제외한다.
        return answer-1;
    }

}
