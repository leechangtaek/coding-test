package programmers.src.programmers;

public class Jump {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(solution(n));

    }
    public static long solution (int n){
        long answer = 0;
        long[] total = new long[n+1];
        total[0] =0;
        total[1] = 1;
        total[2] = 2;

        for(int i=3; i<=n; i++){
            total[i] = (total[i-1]+total[i-2])%1234567;
        }
        answer = total[n];
        return answer;
    }


}
