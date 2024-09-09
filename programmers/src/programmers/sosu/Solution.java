package programmers.src.programmers.sosu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();
        String numbers = "17";


        System.out.println("결과:"+s.solution(numbers));
    }
    HashSet<Integer> hs = new HashSet<>();
    public void recursive(String comb, String others){

        //1.현재 조합을 set에 추가한다.
        if(!comb.equals("")){
            hs.add(Integer.valueOf(comb));
        }
        //2.남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i=0; i<others.length(); i++){
            recursive(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }
    }
    public boolean isPrime(int num){
        //1. 0과 1은 소수가 아니다.
        if(num == 0 || num == 1){
            return false;
        }
        //2.에라토스테네스의 체의 limit을 계산한다.
        int lim = (int)Math.sqrt(num);
        //3.에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인한다.
        for(int i=2; i<lim; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
    public int solution(String numbers) {
        int count = 0;

        //1. 모든조합의 숫자를 만든다.
        recursive("",numbers);
        //2.소수의 개수만 센다.
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                count++;
            }
        }
        //3.소수의 개수를 반환한다.
        return count;
    }

}
