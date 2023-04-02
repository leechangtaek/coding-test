package programmers.src.programmers;

public class Tile3N {

    public static void main(String[] args) {
        /*
            n = 2 일 때 3가지,
            n = 4 일 때 11가지, 3*3 + (0*2)+2
            n = 6 일 때 41가지, 11*3 + (3*2)+2
            n = 8 일 때 153가지, 41*3 + (11+3)*2 +2;
         */
        int n = 8; //11

        System.out.println(solution(n));

    }
    public static int solution (int n ){
        int answer = 0;
        if(n%2 != 0){
            return 0 ;
        }
            
        long[] lo = new long[n+1];
        lo[2] = 3;
        long sum = 0;


        for(int i=4; i<=n; i+=2){
            lo[i] = (lo[i-2]*3 + (sum*2)+2 ) % 1000000007L;
            sum += lo[i - 2] % 1000000007L;
        }
        
        return (int)lo[n] ;
    }



}
