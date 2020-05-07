package programmers.test9;

public class Solution {

	/*
	 * 	0
		010
		01210
		0123210
		012343210
		01234543210
		0123456543210
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			for(int k=i-1; k>=0; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}
	
	
}
