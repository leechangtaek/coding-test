package programmers.src.programmers;

public class MaxMin {

    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(min > Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            }
            if(max < Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            }
        }
        String answer = min+" "+max;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("answer = " + answer);
    }

}
