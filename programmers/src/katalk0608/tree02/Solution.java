package katalk0608.tree02;

import java.util.Scanner;

public class Solution {
	static int N;
	static int[][] nodes;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("노드의 개수를 입력하시오");
		N=sc.nextInt();
		nodes=new int[N][2];//0부모노드 1자식수
		System.out.println("부모자식 관계를 입력하시오");
		for(int i=0; i<N; i++) {
			nodes[i][0]=sc.nextInt();
		}
		getChildNum();
		System.out.println("삭제할 노드의 번호를 입력해주세요");
		remove(sc.nextInt());
		System.out.println(getAnswer());
	}

	private static int getAnswer() {
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(nodes[i][0]!=-2 &&nodes[i][1]==0) {
				cnt++;
			}
		}
		return cnt;
	}

	private static void remove(int num) {
		if(nodes[num][0]!=-1) {//루트노드아니면
			nodes[nodes[num][0]][1]--;//부모노드의 자식수 줄이기
		}
		nodes[num][0]=-2;//지워진 노드 표시
		if(nodes[num][1]>0) {//자식이 있으면
			for(int i=0; i<N; i++) {
				if(nodes[i][0]==num) {
					remove(i);
				}
			}
		}

	}

	private static void getChildNum() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(nodes[j][0]==i) nodes[i][1]++;
			}
		}

	}
}
