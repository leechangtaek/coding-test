package programmers.src.programmers.sosu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution2 {

    public static void main(String[] args) {

        Solution2 s= new Solution2();
        String numbers = "17";


        System.out.println("결과:"+s.solution(numbers));
    }
    HashSet<Integer> hs = new HashSet<>();


    public void recursive(String comb, String others){
        if(!comb.equals("")){
            hs.add(Integer.valueOf(comb));
        }
        for(int i=0; i<others.length(); i++){
            recursive(comb+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }
    }

    public boolean isPrime(int number){
        if(number ==0 || number == 1){
            return false;
        }
        int lim = (int)Math.sqrt(number);

        for(int i=2; i<lim; i++){
            if(number % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public int solution(String numbers) {
        int count = 0;
        recursive("",numbers);
        System.out.println(hs);

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            if(isPrime(it.next())) {
                count++;
            }
        }

        return count;
    }

}
