package programmers.src.programmers.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();

        String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        System.out.println("결과:"+s.solution(info,query));
    }
    public int[] solution(String[] info,String[]  query) {


        //1.INFO를 기반으로 hashmap을 만든다.
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();

        for(String i : info){
            String [] data = i.split(" ");
            String[] languages = {data[0],"-"};
            String[] jobs = {data[1],"-"};
            String[] exps = {data[2],"-"};
            String[] foods = {data[3],"-"};
            Integer value = Integer.parseInt(data[4]);
            for(String lang : languages){
                for(String job : jobs){
                    for(String exp : exps){
                        for(String food : foods){
                            String[] keyData = {lang,job,exp,food};
                            String key = String.join(" ",keyData);
                            ArrayList<Integer> arr = hm.getOrDefault(key,new ArrayList<>());

                            arr.add(value);
                            hm.put(key,arr);
                        }
                    }
                }
            }
        }
        //2. 각 hashMap의 value를 오름차순으로 정렬한다.
        for(ArrayList<Integer> arr : hm.values()){
            arr.sort(null);
        }

        //3.query 조건에 맞는 지원자를 가져온다.

        int [] answer = new int[query.length];
        int i =0;
        for(String q : query){
            String [] data = q.split(" and ");
            int target = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ",data);

            if(hm.containsKey(key)){
                ArrayList<Integer> li = hm.get(key);
               //4.binary search를 통해서 lower-bound를 찾는다.
                int left = 0;
                int right = li.size();

                while(left < right){
                    int mid = (left + right)/2;
                    if(li.get(mid) >= target){
                        right = mid;
                    }else{
                        left = mid + 1;
                    }
                }
                answer[i] = li.size() - left;

            }
            i++;
        }





       return answer;
    }

}
