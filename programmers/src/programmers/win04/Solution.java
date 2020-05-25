package programmers.win04;


public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		String a = "qyyigoptvfb";
		String b = "abcdefghijk";
		int c = -3;
		
		System.out.println("결과:"+s.solution(a, b, c));
	}
	public String solution(String encrypted_text, String key, int rotation ) {
			String answer = "";
	      char[] arr = encrypted_text.toCharArray();
	      char[] decrypt = new char[arr.length];
	      
	      int min = (int)'a'; //97
	      int max = (int)'z'; //122
	      
	      for(int i=0;i<arr.length;i++) {
	         int index = 0;
	         
	         rotation = rotation%arr.length;
	         System.out.println(rotation);
	         //rotation 되돌리기
	         if(i-rotation >= 0 && i-rotation < arr.length) {//적당한위치
	        	 index = i-rotation;
	             decrypt[index] = arr[i];
	          }else if(i-rotation >= arr.length){//
	             index = (i-rotation) - arr.length;
	             decrypt[index] = arr[i];
	          }
	          else {
	             index = arr.length+(i-rotation);
	             decrypt[index] = arr[i];
	          }
	         int keyNum = (int)key.charAt(index) - min + 1; //1~26
	         int num = (int)decrypt[index] - keyNum;
	         char ch;
	         
	         if(num < min) ch = (char)(max - (min - num) + 1);
	         else ch = (char)num;
	            
	         decrypt[index] = ch;
	      }
	      answer = String.valueOf(decrypt);
//	     
	      
	      return answer;
    }
	
	

}
