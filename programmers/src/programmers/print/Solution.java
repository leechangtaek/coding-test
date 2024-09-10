package programmers.src.programmers.print;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();

        int [] priorities = {2,1,3,2};

        System.out.println("결과:"+s.solution(priorities,2));
    }
    public int solution(int[] priorities,int location) {
        int answer = 0;

        //1.Queue를 만들기
        List<Integer> printer = new LinkedList<>();
        //2. 0번을 꺼내서 max priority 가 아니면 다시 끝에 넣는다.
        while(!printer.isEmpty()){
            Integer priority = printer.remove(0);
            if(printer.stream().anyMatch(otherPriority -> priority < otherPriority)){
                printer.add(priority);
            }else{
                //3. max priority이면 내가 찾는 job이 맞는지 확인한다.
                answer++;
                if(location == 0){
                    break;
                }
            }
            location--;
            if(location < 0){
                location = printer.size()-1;
            }
        }




       return answer;
    }

}
