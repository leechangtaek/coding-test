package programmers.src.kakao.kakao07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/**
 * [] or :대괄호 안의 모든문자
 * [^] not : 대괄호 안의 문자 외의 모든문자
 * ^[] 대괄호 안의 문자로 시작하는 문자열
 * []$ 대괄호 안의 문자로 끝나는 문자열
 * + 1개 이상의 문자
 */
public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();
        String new_id = "....!@BaT#*..y.abcdefghjklm";

        System.out.println("결과:"+s.solution(new_id));
    }
    public String solution(String new_id) {
        String answer = "";

        //1.소문자로 치환
        new_id = new_id.toLowerCase();

        //2.소문자,숫자,빼기,-,_,.
        //answer = new_id.replaceAll("[^a-z0-9-_.]","");
        for(int i=0; i<new_id.length(); i++){
            char ch = new_id.charAt(i);
            if(Character.isAlphabetic(ch) ||
                Character.isDigit(ch) ||
                ch == '-' || ch == '_' || ch =='.'){
                answer += ch;
            }
        }

        //3.마침표(.) 가 2개이상
        //answer = answer.replaceAll("\\.+",".");
        while(answer.indexOf("..") != -1){
            answer = answer.replace("..",".");
        }

        //4.마침표(.)가 처음이나 끝에 위치한다면 제거
        //answer = answer.replaceAll("^[.]|[.]$","");
        if(!answer.isEmpty() && answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }
        if(!answer.isEmpty() && answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0,answer.length()-1);
        }
        //5.빈문자열이라면 new_id에 "a"를 대입
        if(answer.isEmpty()){
            answer = "a";
        }
        //6.길이가 16자이상
        if(answer.length() > 15){
            answer = answer.substring(0,15);
            //answer = answer.replaceAll("[.]$","");
            if(answer.charAt(answer.length()-1) == '.'){
                answer.substring(0,answer.length()-1);
            }
        }

        //8.길이가 2자잏
        while(answer.length() < 3){
            answer += answer.charAt(answer.length() -1);
        }
        return answer;
    }

}
