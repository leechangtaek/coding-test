package programmers.src.programmers;

public class Emoticons2 {

    static int f_cnt = 0;
    static int f_sum = 0;
    public static void main(String[] args) {
//        int [][] users = {{40, 10000}, {25, 10000}};
        int [][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
//        int [] emoticons = {7000,9000};
        int [] emoticons = {1300, 1500, 1600, 4900};
        int [] answer = new int[2];

        int [] per = new int[emoticons.length];
        
        comb(per, 0, users,emoticons);
        System.out.println("f_cnt = " + f_cnt);
        System.out.println("f_cnt = " + f_sum);
    }
    
    public static void comb(int[] per , int start , int [][] users, int [] emoticons){
        if(per.length == start){
            calculate(per,users,emoticons);
            return;
        }
        for(int i=10; i<=40; i+=10){
            per[start] = i;
            comb(per, start+1 , users, emoticons);
        }
    }

    private static void calculate(int[] per, int[][] users, int[] emoticons) {
        int cnt = 0;
        int t_sum = 0;
        for(int [] user : users){
            int discount = user[0];
            int money = user[1];
            int sum = 0;

            for(int i=0; i<per.length; i++){
                if(discount <= per[i]){
                    sum+=emoticons[i]*((100-per[i])*0.01);
                }
            }
            if(sum >= money){
                cnt++;
            }else{
                t_sum+=sum;
            }
        }
        if(f_cnt < cnt){
            f_cnt = cnt;
            f_sum = t_sum;
        }else if(f_cnt == cnt){
            if(f_sum < t_sum){
                f_sum = t_sum;
            }
        }

    }

}
