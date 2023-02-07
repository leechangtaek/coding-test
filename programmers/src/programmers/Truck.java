package programmers.src.programmers;

import java.util.*;

public class Truck {

    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int [] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int answer = weight==bridge_length?1:0;

        Queue<Integer> st = new LinkedList<>();

        for(int i =0; i<truck_weights.length; i++){

            if(st.isEmpty()){
                st.add(truck_weights[i]);
                answer+=bridge_length;
            }else{
                if(bridge_length > st.size()){
                    if(st.peek()+truck_weights[i] <= weight){
                        st.add(truck_weights[i]);
                        answer+=bridge_length;
                    }else{
                        i--;
                        st.poll();
                    }

                }else if(bridge_length == st.size()){
                    i--;
                    st.poll();

                }
            }
        }
        System.out.println(answer);





    }

}
