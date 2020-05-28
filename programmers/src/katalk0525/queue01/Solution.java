package katalk0525.queue01;

/**
 * 회문찾기
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int count = sc.nextInt();
		
		int flag= 0;
		
		for(int i=1; ; i++) {
			if(i<10) {
				flag++;
			}
			String a = Integer.toString(i);
			String arr[] = a.split("");
			
			for(int j=0; j<arr.length/2; j++) {
				if(arr[j].equals(arr[arr.length-j-1])) {
					flag++;
				}
			}
			if(flag==count) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
