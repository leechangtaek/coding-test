package programmers.src.programmers.archer;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int info[] = {2,1,1,1,0,0,0,0,0,0,0};
        int[] answer = new int[11];
        for(int i=0; i<info.length; i++) {
            if(n == 0) {
                break;
            }
            if(i !=10) {
//				System.out.println("@@@@@@@@i="+info[i]);
//				System.out.println("@@@@@@@@j="+info[i+1]);
                if(info[i]<=info[i+1]) {
                    n-= (info[i]+1);
                    if(n<0) {
                        n+=(info[i]+1);
                        answer[i] = 0;
                    }else {
                        answer[i] = info[i]+1;
                    }
                }else {
                    answer[i] = 0;
                }
            }else {
                answer[i] = n;
            }
        }
        int sumA =0;
        int sumB = 0;
        for(int i=0; i<answer.length; i++) {
            if(info[i]>answer[i]) {
                sumA += (10-i);
            }else if(info[i]<answer[i]) {
                sumB += (10-i);
            }
        }
        if(sumA > sumB) {
            answer = new int [1];
            answer[0] = -1;
        }

    }
}
