package programmers.src.programmers.archer;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int info[] = {2,1,1,1,0,0,0,0,0,0,0};

        int [] answer=  new int[11];
        int [] tmp = new int[11];
        int maxDiff = 0;

        for(int subset=1; subset<(1<<10); ++subset){  //총 경우의 수
            int ryan =0, apeach =0, cnt=0;
            for(int i =0; i<10; i++){ // 10자리
                if((subset & (1<<i))!=0){ // 0이 아니면 이긴걸로
                    ryan += 10-i;
                    tmp[i] = info[i]+1;
                    cnt += tmp[i];
                }else{
                    tmp[i] = 0;
                    if(info[i] > 0){
                        apeach += 10-i;
                    }
                }

            }
            if(cnt > n) continue;

            tmp[10] = n-cnt;
            if(ryan-apeach == maxDiff){
                for(int i = 10; i>=0; --i){ //뒤에서 부터 검색해서 하나라도 나오면 작은거
                    if(tmp[i]>answer[i]){
                        maxDiff = ryan-apeach;
                        answer = Arrays.copyOf(tmp, tmp.length);
                        break;
                    }else if(tmp[i] < answer[i]){
                        break;
                    }
                }
            }else if(ryan-apeach > maxDiff){
                maxDiff = ryan-apeach;
                answer = Arrays.copyOf(tmp, tmp.length);
            }

            if(maxDiff == 0){
                answer = new int[]{-1};
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    

}
