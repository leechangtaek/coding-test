package programmers.src.programmers;

public class Carpet {

    public static void main(String[] args) {

        int brown = 24;  // (x* y) - ((x-2) * (y-2))
        int yellow = 24; //(x-2) * (y-2)



        System.out.println(solution(brown,yellow));

    }
    public static int[] solution (int brown, int yellow ){
        int[] answer = {};
        int width = 3;
        int height = 3;
        while(width >= height){
            int y = (width-2) * (height-2);
            int b = (width * height) - y;
            if(y == yellow && b == brown){
                break;
            }
            if(y<yellow && b>=brown){
                width--;
                height++;
            }else{
                width++;
            }
        }


        System.out.println("width = " + width);
        System.out.println("height = " + height);


        return answer ;
    }



}
