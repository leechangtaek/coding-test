package programmers.test05;

public class Solution {

	
	public static void main(String[] args) {
		Solution s = new Solution();
		String a = "1924";
		int a1 = 2;
		String b = "1231234";
		int b1 = 3;
		String c = "4177252841";
		int c1 = 4;
		
		System.out.println("결과:"+s.maxNumber(a, a1));
		System.out.println("결과:"+s.maxNumber(b, b1));
		System.out.println("결과:"+s.maxNumber(c, c1));
	}
	
	public String maxNumber(String number, int k) {
		StringBuilder sb = new StringBuilder(number);
		int delCount = 0;
		int index =1;
		int i=0;
		
		while(delCount != k) {
			if(index>=1 && sb.charAt(index-1)<sb.charAt(index)) {
				sb.deleteCharAt(index-1);
				index--;
				delCount++;
			}
			else {
				if(index == sb.length()-1 && sb.charAt(index)<= sb.charAt(index-1)) {
					sb.deleteCharAt(index);
					delCount++;
					index--;
				}
				else {
					index++;
				}
			}
		}
		
		
		
		
		return sb.toString();
				
	
	}
}
