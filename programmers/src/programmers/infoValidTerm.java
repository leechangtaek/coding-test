package programmers.src.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class infoValidTerm {
    public static void main(String[] args) {

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies ={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println("answer = " + solution(today,terms,privacies));
    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<privacies.length; i++){

            String [] privaciesSp = privacies[i].split(" ");
            String term = privaciesSp[0];
            String gbn = privaciesSp[1];

            int year = Integer.parseInt(term.substring(0,4));
            int month = Integer.parseInt(term.substring(5,7));
            int day = Integer.parseInt(term.substring(8,10));

            String maxTerm = "";
            
            for(int j=0; j <terms.length; j++){
                String [] termsSp = terms[j].split(" ");
                String termGbn = termsSp[0];
                int validTerm = Integer.parseInt(termsSp[1]);
                
                if(termGbn.equals(gbn)){
                    String maxYear = year+"";
                    String maxMonth = month+"";
                    String maxDay = day+"";

                    maxTerm = maxYear+"."+maxMonth+"."+maxDay;

                    if(day == 1){
                        if((month+validTerm-1)/12 != 0){
                            maxYear = (year+((month+validTerm-1)/12))+"";
                            maxMonth = (month+validTerm-(12+((month+validTerm-1)/12)))+"";
                        }else{
                            maxMonth = (month+validTerm-((month+validTerm-1)/12))+"";
                        }
                        maxDay = "28";
                    }else{
                        if((month+validTerm)/12 != 0){
                            maxYear = (year+((month+validTerm)/12))+"";
                            maxMonth = (month+validTerm-((month+validTerm)/12))+"";
                        }else{
                            maxMonth = (month+validTerm)+"";
                        }
                        maxDay = (day-1)+"";
                    }
                    String sepMon = ".";
                    String sepDay = ".";
                    if(maxMonth.length() == 1){
                        sepMon = ".0";
                    }

                    if(maxDay.length() == 1){
                        sepDay = ".0";
                    }
                    maxTerm = maxYear + sepMon + maxMonth + sepDay + maxDay;

                }
            }
            System.out.println("maxTerm = " + maxTerm);
            if(Integer.parseInt(today.replace(".","")) > Integer.parseInt(maxTerm.replace(".",""))){
                result.add((i+1));
            }
        }


        answer =  result.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}
