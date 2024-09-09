package programmers.src.programmers.maraton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        String [] participant = {"leo", "kiki", "eden"};
        String [] completion = {"eden", "kiki"};

        System.out.println("결과 : "+solution(participant,completion));
    }


    public static String solution(String[] participant, String[] completion){
        String answer = "";

        Set<String> hs = new HashSet<String>();

        Map<String, Integer> mp = new HashMap<String,Integer>();


        for (String s : participant) {
            mp.put(s, mp.getOrDefault(s,0)+1);
        }
        System.out.println(mp);
        for(String s : completion){
            mp.put(s,mp.get(s)-1);

        }
        System.out.println(mp);

        for (String s : mp.keySet()) {
            if(mp.get(s) > 0){
                answer = s;
                break;
            }
        }

        return answer;
    }
}
