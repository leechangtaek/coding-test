package programmers.src.ajdnetworks;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Solution s= new Solution();

        int [] arr ={50,98,38,11,13,90,82,83,70};
        System.out.println("결과:"+s.solution(arr));

        //답 70,50,82.38.83.13,90,11,98
    }

    public int[] solution(int [] arr) {

        HashSet<Integer> hs = new HashSet<>();

        //1.중복제거
        for(int i :arr){
            hs.add(i);
        }
        System.out.println(hs);

        //2.정렬
        int count =0;
        for(Integer i : hs){
            arr[count] =i;
            count++;
        }
        Arrays.sort(arr);
        //중간값구하고
        int midIndex = arr.length/2;
        int mid = arr[midIndex];

        System.out.println("hs.size() = " + hs.size());
        int[] answer = new int[hs.size()];

        //중간값보다 낮은애들
        int [] desc = new int[midIndex];
        //중간값보다 높은애들
        Integer [] asc = new Integer[midIndex];
        for(int i=0; i<midIndex; i++){
            asc[i] = arr[i];
            desc[i] = arr[i+midIndex+1];
        }
        //중간값보다 낮은애들 내림차순
        Arrays.sort(asc, Collections.reverseOrder());

        answer[0] = mid;

        int ascCnt=0;
        int descCnt = 0;

        for(int i=1; i<asc.length+desc.length+1; i++){
            if(i%2==0){
                answer[i] = asc[ascCnt];
                ascCnt++;
            }else{
                answer[i] = desc[descCnt];
                descCnt++;
            }
        }

        return answer;
    }
}
