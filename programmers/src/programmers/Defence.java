package programmers.src.programmers;

import java.util.*;

public class Defence {
    static int answer = -1;
    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        int enemy[]  = {3, 3, 3, 3};
        int answer= 0;
        int a = k> enemy.length-1? enemy.length-1 :k;
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<enemy.length; i++){
            n-=enemy[i];
            que.add(enemy[i]);
            if(n<0){
                System.out.println("i = "+i);
                System.out.println("n = "+n);
                System.out.println("k = "+k);
                if(a>0 && !que.isEmpty()){
                    n+= que.poll();
                    a--;
                }else{

                    answer =k> enemy.length-1? (i+1) :i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

}
