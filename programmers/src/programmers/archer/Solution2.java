package programmers.src.programmers.archer;

import java.util.Arrays;

public class Solution2 {

    static int[] res = { -1 };
    static int[] lion;
    static int max = -1000;
    public static void main(String[] args) {
        int n = 5;
        int info[] = {2,1,1,1,0,0,0,0,0,0,0};

        System.out.println(Arrays.toString(solution(n,info)));

    }
    public static void dfs(int[] info, int cnt, int n) {
        if(cnt == n+1) {
            int apeach_point = 0;
            int lion_point = 0;
            for(int i = 0; i <= 10; i++)
            {
                if(info[i] != 0 || lion[i] != 0) {
                    if(info[i] < lion[i])
                        lion_point += 10 - i;
                    else
                        apeach_point += 10 - i;
                }
            }
            if(lion_point > apeach_point) {
                if(lion_point - apeach_point >= max)
                {
                    res = lion.clone();
                    max = lion_point - apeach_point;
                }
            }
            return ;
        }
        for(int j = 0; j <= 10 && lion[j] <= info[j]; j++) {
            lion[j]++;
            dfs(info, cnt + 1, n);
            lion[j]--;
        }
    }
    public static int[] solution(int n, int[] info) {
        lion = new int[11];
        dfs(info,1,n);
        return res;
    }
    

}
