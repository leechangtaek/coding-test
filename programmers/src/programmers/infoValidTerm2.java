package programmers.src.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class infoValidTerm2 {
    public static void main(String[] args) {

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies ={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println("answer = " + solution(today,terms,privacies));
    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        String answer = "";
        int[] t_today = Arrays.stream(today.substring(2, 10).split("\\.")).mapToInt(Integer::parseInt).toArray();
        int s_today = t_today[0]*12*28+t_today[1]*28+t_today[2];

        for (int i=0; i < privacies.length; i++) {
            int[] t_date = Arrays.stream(privacies[i].substring(2, 10).split("\\.")).mapToInt(Integer::parseInt).toArray();
            int date = t_date[0]*12*28+t_date[1]*28+t_date[2];

            for (String t: terms) {
                if (t.charAt(0) == privacies[i].charAt(11)) {
                    date += Integer.parseInt(t.substring(2))*28;
                    break;
                }
            }

            if (date <= s_today) answer += (i+1)+" ";
        }
        System.out.println("answer = " + answer);

        return Arrays.stream(answer.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
