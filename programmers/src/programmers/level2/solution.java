package programmers.src.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {

        int k = 5;
        int ranges[][] = {{0,0},{0,-1},{2,-3},{3,-3}};
        double [] answer = new double[ranges.length];

        List<Integer> li = new ArrayList<>();

        while (k>1){
            li.add(k);
            if(k%2 == 0){
                k/=2;
            }else{
                k = (k*3)+1;
            }
        }
        li.add(1);

        for(int i=0; i<ranges.length; i++){
            int b= li.size()+ranges[i][1] -1;
            double area = 0.0;

            if(ranges[i][0]>b){
                answer[i]= -1;
                continue;
            }

            for(int j=ranges[i][0]; j<b; j++){
                area += (li.get(j)+li.get(j+1))/2.0;
            }
            answer [i] =area;
        }
    }
}
