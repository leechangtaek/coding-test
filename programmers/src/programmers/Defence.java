package programmers.src.programmers;

import java.util.*;

public class Defence {
    static int answer = -1;
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int enemy[]  = {4, 2, 4, 5, 3, 3, 1};

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int round = 0; round < enemy.length; round++) {
            // 각 라운드의 적의 수를 queue에 담는다
            queue.add(enemy[round]);
            // 무적권의 수 보다 방어할 라운드가 많은 경우, 적의 수가 가장 적은 라운드 전투하여 병력감소
//            if (queue.size() > k)
//                n -= queue.poll();
//            // 병력이 0보다 적어지면 게임이 종료되며 해당 라운드 수를 반환한다(라운드는 0-index 이므로 -1 하지 않아도 된다)
//            if (n < 0)
//                return round;
        }
        // 게임 클리어 한 경우, 총 라운드 수 반환
//        return enemy.length;
//        int answer= 0;
//        int a = k> enemy.length-1? enemy.length-1 :k;
//        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0; i<enemy.length; i++){
//            n-=enemy[i];
//            que.add(enemy[i]);
//            if(n<0){
//                System.out.println("i = "+i);
//                System.out.println("n = "+n);
//                System.out.println("k = "+k);
//                if(a>0 && !que.isEmpty()){
//                    n+= que.poll();
//                    a--;
//                }else{
//
//                    answer =k> enemy.length-1? (i+1) :i;
//                    break;
//                }
//            }
//        }
//        System.out.println(answer);
    }

}
