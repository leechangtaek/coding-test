package programmers.src.programmers;

import java.util.*;

public class Tuple {

    public static void main(String[] args) {
        String s ="{{20,111},{111}}";
        int [] answer = {};
        List<Integer> li = new ArrayList<>();

        /* 정렬 참고.
        String[] arr2 = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
        Arrays.sort(arr2, (a, b)->{return a.length() - b.length();});
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
        */

        String [] a1 = s.replace("{","").split("},");
        int max= a1[0].split(",").length;;
        for(int i=1; i<a1.length; i++){
            max = Math.max(max,a1[i].split(",").length);
        }
        for(int j=1; j<=max; j++){
            for(int i=0; i<a1.length; i++){
                int len = a1[i].replace("}","").split(",").length;
                String [] arr = a1[i].replace("}","").split(",");

                if(len==j){
                    for(int k=0; k<arr.length; k++){
                        if(!li.contains(Integer.parseInt(arr[k]))){
                            li.add(Integer.parseInt(arr[k]));
                        }
                    }
                }
            }
        }
        answer = li.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(answer));

    }

}
