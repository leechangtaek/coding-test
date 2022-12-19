package programmers.src.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compression {

    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";

        int answer = s.length();

        for(int i=1; i<=s.length()/2; i++){
            int count = 1;
            String str = s.substring(0,i);
            StringBuilder sb = new StringBuilder();

            for(int j=i; j<=s.length(); j+=i){
                String str2 = s.substring(j,(i+j)>s.length()?s.length():(i+j));
                System.out.println("str = " + str);
                System.out.println("str2 = " + str2);
                if(str.equals(str2)){
                    count++;
                }else{
                    sb.append((count!=1?count:"")+str);
                    str = str2;
                    count= 1;
                }
            }
            sb.append(str);
            answer = Math.min(answer, sb.length());
            System.out.println("answer = " + answer);
        }
        System.out.println(answer);
    }

}
