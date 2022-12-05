package programmers.src.programmers;

public class Pot {
    public static void main(String[] args) {
        int k = 2;
        int d = 4;
        long answer = 0;
        for(int i=0; i<=d; i+=k) {
            int result = ((int) Math.sqrt(Math.pow(d, 2)-Math.pow(i, 2)))/k +1;
            answer +=result;
        }

    }
}
