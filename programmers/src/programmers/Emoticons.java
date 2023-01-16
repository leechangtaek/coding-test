package programmers.src.programmers;

public class Emoticons {

    static int count = 0; //최종 횟수
    static int money = 0; //최종 돈
    public static void main(String[] args) {
        int [][] users = {{40, 10000}, {25, 10000}};
        int [] emoticons = {7000,9000};
        int [] answer = new int[2];

        int [] arr = new int [emoticons.length]; //이모티콘이 할인되는 퍼센트


        comb(arr,0,users,emoticons);

        System.out.println("count = " + count);
        System.out.println("money = " + money);
    }
    public static void comb(int[]arr,int start, int[][]users,int[]emoticons){
        if(start == arr.length){
            calculate(arr,users,emoticons);
            return;
        }
        for(int i=10; i<=40; i+=10){
            arr[start] = i;
            comb(arr,start+1,users,emoticons);
        }
    }
    public static void calculate(int[] arr, int [][]users, int []emoticons){
        int cnt =0;
        int t_sum =0;
        for(int i=0; i<users.length; i++){
            int discount = users[i][0];
            int price = users[i][1];
            int sum =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=discount){
                    sum+=emoticons[j]*((100-arr[j])*0.01);
                }
            }
            if(sum>=price){
                cnt++;
            }else{
                t_sum += sum;
            }
        }
        if(cnt > count ){
            count = cnt;
            money = t_sum;
            return;
        }
        else if(count == cnt){
            if(t_sum > money){
                money = t_sum;
            }
        }
    }

}
