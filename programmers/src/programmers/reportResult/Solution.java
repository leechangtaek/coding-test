package programmers.src.programmers.reportResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println("결과:"+s.solution(id_list,report,k));
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        //1.중복제거
        HashSet<String> reportSet = new HashSet<>();
        for (String s : report) {
            reportSet.add(s);
        }
        //2.notifylistHash 만들기 키 : 신고당한자, 밸류 : 신고자들 리스트
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for(String rep : reportSet){
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0,blankIdx);
            String reportee = rep.substring(blankIdx+1);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee,new ArrayList<>());

            reporterList.add(reporter);
            notifyListHash.put(reportee,reporterList);
        }

        //3.notifyListHash를 기반으로 reportHash 만들기
        HashMap<String,Integer> reporterHash = new HashMap<>();
        for(ArrayList<String> notifyList : notifyListHash.values()){
            if(notifyList.size() >= k){
                for(String reporter : notifyList){
                    reporterHash.put(reporter,reporterHash.getOrDefault(reporter,0)+1);
                }
            }

        }
        //4.reporterHash를 기반으로 answer를 배열로 만들기
        for(int i=0; i< id_list.length; i++){
            answer[i] = reporterHash.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}
