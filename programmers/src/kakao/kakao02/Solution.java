package programmers.src.kakao.kakao02;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dart score : ");
		String inputVal = sc.nextLine();
		
		int len = inputVal.length(); //입력된 값의 길이
		int step = 1; //1:점수 | 2:보너스 |[3:옵션 #|*]
		int lenPos = 0; //입력된 값의 길이
		int [] score = new int[3]; //점수
		int scorePos = 0; //점수의 좌표
		//1S2D*3T    -- 37
		//1D2S#10S   -- 9
		//1D2S0T     --3
		//1S*2T*3S   --23
		//1D#2S*3S   --5
		//1T2D3D#    -- -4
		//1D2S3T*    --59
		
		
		//1.입력된 길이만큼 반복 분석
		while(lenPos < len) {
			String target = inputVal.substring(lenPos, lenPos+1);
			if(step ==1) {
				try {
					//1.1 1단계 점수처리 숫자만 올 수 있다.
					score[scorePos] = Integer.parseInt(target);
					step++;
					
				}catch(Exception e) {
					//1.3 3단계 옵션처리
					if("*".equals(target)) {
						//1.3.1 스타상
						score[scorePos-1] = score[scorePos-1]*2;
						if(scorePos>1) {
							score[scorePos-2] = score[scorePos-2]*2;
						}
					}
					else if("#".equals(target)) {
						//1.3.2 아차상
						score[scorePos-1] = score[scorePos-1]*(-1);
					}
					else {
						System.out.println("유효한 다트 점수가 아닙니다.");
						return;
					}
				}
			}
			else if(step ==2) {
				//1.2 2단계 영역처리
				if("S".equals(target)) {
					//1.2.1 Single처리
					score[scorePos] = (int)Math.pow(score[scorePos], 1);
				}
				else if("D".equals(target)) {
					//1.2.2 Double처리
					score[scorePos] = (int)Math.pow(score[scorePos], 2);
				}
				else if("T".equals(target)) {
					//1.2.3 Triple처리
					score[scorePos] = (int)Math.pow(score[scorePos], 3);
				}
				else if("0".equals(target)) {
					//1.1.1 10점처리
					//점수가 0~10 사이의 점수이기 때문에 0이 나올 수 있다.
					if(score[scorePos]==1) {
						score[scorePos]=10;
						//2단계 처리를 다시 하기 위해서 값을 조절
						scorePos--;
						step++;
					}
				}
				else {
					System.out.println("유효한 다트 점수가 아닙니다.");
					return;
				}
				scorePos++;
				step--;
			}
			//다음 문자 처리
			lenPos++;
		}
		System.out.println(score[0]+score[1]+score[2]);
	}

}
