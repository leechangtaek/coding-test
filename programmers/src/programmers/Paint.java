package programmers.src.programmers;

public class Paint {

    public static void main(String[] args) {
        int n =8;
        int m = 4;
        int [] section = {2,3,6};
        int answer = 0;
        int location = section[0]-1;

        for(int i=0; i< section.length; i++) {
            if(location < section[i]) {
                location = section[i]+m-1;
                answer+=1;
            }

        }
        System.out.println("answer = " + answer);
    }

}
