package programmers.src.programmers;

public class NextBigNumber {

    public static void main(String[] args) {

        int n = 15;
        System.out.println(solution(n));

    }
    public static int solution (int n){
        int answer = n;

        System.out.println("Integer.bitCount(n) = " + Integer.bitCount(n));

        int count = 0;
        while(count == 0){
            answer++;
            if(Integer.bitCount(answer) == Integer.bitCount(n) && answer>n){
                count ++;
            }
        }
        return answer;
    }


}
