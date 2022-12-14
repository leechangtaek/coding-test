package programmers.src.programmers;

import java.util.*;

public class MenuRenewual {
    static Map<String, Integer> hm = new HashMap<String,Integer>();

    public static void main(String[] args) {
        String order [] = {"XYZ", "XWY", "WXA"};
        int [] course = {2,3,4};

        String answer [] = {};

        for(int i=0; i<order.length; i++){
            boolean [] visited = new boolean[order[i].length()];
            for(int j=course[0]; j <= order[i].length(); j++){ //제일 낮은 조합, 제일 높은 조합까지
                rec(order[i].toCharArray(), visited, 0, order[i].length(), j);
            }
        }
        HashMap<Integer, String> hmm = new HashMap<>();
        System.out.println(hm);
        for(int i=0; i< course.length; i++){
            for(String key : hm.keySet()){
                if(key.length()== course[i] && hm.get(key)>1){
                    if(!hmm.containsKey(course[i])){
                        hmm.put(course[i],key);
                    }else{
                        String hmmString =hmm.get(course[i]).contains(" ")?hmm.get(course[i]).substring(0,hmm.get(course[i]).indexOf(' ')):hmm.get(course[i]);
                        if(hm.get(hmmString) < hm.get(key)){
                            hmm.remove(course[i]);
                            hmm.put(course[i],key);
                        }else if(hm.get(hmmString) == hm.get(key)){
                            hmm.put(course[i],hmm.get(course[i])+" "+key);
                        }
                    }
                }
            }
        }
        List<String> li = new ArrayList<>();
        for(String a : hmm.values()){
            String b []= a.split(" ");
            for(String c : b){
                li.add(c);
            }
        }
        Collections.sort(li);
        answer = li.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
    }
    public static void rec (char[] order , boolean[] visited, int start, int n ,int r){
        if (r == 0) {
            String keyOrder ="";
            for(int i=0; i<n; i++){
                if(visited[i]){
                    keyOrder += order[i];
                }
            }
            char [] arr = keyOrder.toCharArray();
            Arrays.sort(arr);
            keyOrder = new String(arr);
            hm.put(keyOrder,hm.getOrDefault(keyOrder,0)+1);
//            print(order, visited, n);
//            return;
        }
        for (int i = start; i < n; i++) {
            visited[i] = true;
            rec(order, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
//    static void print(char[] order, boolean[] visited, int n) {
//        for (int i = 0; i < n; i++) {
//            if (visited[i]) {
//                System.out.print(order[i] + " ");
//                hm.put(order[i]+"",hm.getOrDefault(order[i],0)+1);
//            }
//        }
//        System.out.println();
//    }

}
