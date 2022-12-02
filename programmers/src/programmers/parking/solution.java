package programmers.src.programmers.parking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int answer[] = {};
        int fees[] = {180, 5000, 10, 600};
        String records[] = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT"
                            , "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN"
                            , "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        Map<String, Integer> countHm = new HashMap<>();

        for(int i=0; i<records.length; i++){
            String carNum = records[i].split(" ")[1];
            countHm.put(carNum,countHm.getOrDefault(carNum,0)+1);
        }
//        System.out.println(countHm);
        //홀수면 마지막에 23:59분 뺴줘야함.
        //짝수면 맨마지막에서 그냥 뺴면됨.
        Map<String,Integer> timeHm = new HashMap<>();
        answer = new int[countHm.size()];
        for(int i=0; i<records.length; i++){
            int time = Integer.parseInt(records[i].split(" ")[0].substring(0,2))*60
                    + Integer.parseInt(records[i].split(" ")[0].substring(3,5));
            String carNum = records[i].split(" ")[1];
            String carIo = records[i].split(" ")[2];
            if(countHm.get(carNum)%2==0){
                if(carIo.equals("IN")){
                    timeHm.put(carNum,timeHm.getOrDefault(carNum,0)+(time*-1));
                }else{
                    timeHm.put(carNum,timeHm.getOrDefault(carNum,0)+time);
                }
            }else{
                if(carIo.equals("IN")){
                    timeHm.put(carNum,timeHm.getOrDefault(carNum,0)+(time*-1));
//                    System.out.println(timeHm);
                    if(countHm.get(carNum) == 1){
                        timeHm.put(carNum,timeHm.getOrDefault(carNum,0)+((23*60)+59));
                    }else{
                        countHm.put(carNum,countHm.get(carNum)-2);
                    }
                }else{
                    timeHm.put(carNum,timeHm.getOrDefault(carNum,0)+time);
                }
            }
        }
        Object[] mapkey = timeHm.keySet().toArray();
        Arrays.sort(mapkey);
        for(int i=0; i<mapkey.length; i++){
            int amt = timeHm.get(mapkey[i])>fees[0]?timeHm.get(mapkey[i])-fees[0]:0;
            int fee = (amt%fees[2])==0?amt/fees[2]:(amt/fees[2])+1;
            answer[i] = fees[1] + fee*fees[3];
        }

        System.out.println(Arrays.toString(answer));


    }
}
