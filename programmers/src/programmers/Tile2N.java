package programmers.src.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Tile2N {

    public static void main(String[] args) {

        int n = 7;
        System.out.println(solution(n));

    }
    public static int solution (int n ){
        int answer = 0;

        int [] arr = new int [n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for(int i =3 ; i<=n ; i++){
            arr[i] = (arr[i-1]+arr[i-2]) % 1000000007;
        }

        answer = arr[n];
        return answer ;
    }



}
