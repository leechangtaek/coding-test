package programmers.star;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
//		s.solution();
//		s.solution2();
		s.solution3();
//		s.solution4();
//		s.solution5();
		
		
		
		
	}
	/**
	 * 
	 * ****
	 * ****
	 * ****
	 * ****
	 */
	public void solution() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/**
	 * *
	 * **
	 * ***
	 * ****
	 */
	public void solution2() {
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 *    *
	 *   **
	 *  ***
	 * **** 
	 */
	public void solution3() {
		for(int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	/**
	 *   *
	 	***
	   *****
	  *******
	 */
	public void solution4() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<7/2-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	/**
	 *   *   
        ***  
       ***** 
        ***  
         *   
	 */
	public void solution5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력해주세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i<=num/2) {
					if(i+j<=num/2-1) {
						System.out.print(" ");
					}else if(j-i>=num/2+1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else if(i>num/2) {
					if(i-j>=num/2+1) {
						System.out.print(" ");
					}else if(i+j>=num/2*3+1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println(" ");
		}
	}
	
}
