package katalk0608.tree01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	
	public static Node tree[]; //트리
	public static int n, delList[]; //노드 개수, 삭제 리스트 배열
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, pa ;
		System.out.println("노드의 개수를 입력하시오");
		n = Integer.parseInt(in.readLine());
		tree = new Node[n]; //트릐의 배열 선언
		delList = new int[n]; //삭제리스트 배열 선언
		
		System.out.println("부모자식 관계를 입력하시오");
		String line[] = in.readLine().split(" ");
		for(i=0; i<n; i++) tree[i] = new Node(); //클래스 초기화
		for(i=0; i<n; i++) {
			pa= Integer.parseInt(line[i]); //i번 노드의 부모 번호
			tree[i].num = i; //i번 노드의 노드 번호 =i
			tree[i].parent = pa; //i번 노드의 부모 번호 = pa
			//입력한 노드가 루트노드가 아닐때, 부모노드에 자식 정보를 추가해준다.
			//if문 처리 안해주면 tree[-1]되서 런타임 에러
			if(pa!=-1) tree[pa].setChild(i);
		}
		System.out.println("삭제할 노드의 번호를 입력해주세요");
		delete(Integer.parseInt(in.readLine()));
		out.write(String.valueOf(getLeaf()));
		out.close();
		in.close();
	}
	
	//리프노드의 수 구하는 메소드
	private static int getLeaf() {
		int i, cnt = 0;
	   	for(i=0;i<n;i++)
	    //노드가 존재 & 자식이 0명이면 cnt++
	    if(tree[i]!=null && tree[i].childCnt==0)
	       	cnt++;
	   	return cnt;
		
	}
	
	//num번 노드를 삭제하는 메서드
	public static void delete(int num) {
		makeDelList(num);//삭제 리스트를 만듦
		int i, k, pa;
		for(i=0; i<n; i++) {
			k= tree[i].num; //현재 노드 번호
			if(delList[k]==1) {//현재 노드 번호가 삭제 예정 리스트에 있으면
				pa = tree[k].parent; //현재 노드의 부모
				tree[k] = null; //현재 노드 삭제
				//부모가 -1이 아님(=root가 아님) & 부모노드가 삭제되지 않고 존재하는 경우
				if(pa!=-1 && tree[pa] !=null) {
					tree[pa].childCnt--; //부모노드의 자식 수 -1
					tree[pa].child[k] = 0; //부모노드의 k번(=현재노드) 자식 제거
				}
			}
		}
	}
	
	//num번 노드와 연결된 삭제 예정 리스트를 모두 찾는 재귀 메서드
	private static void makeDelList(int num) {
		delList[num] = 1; //현재 노드 num번을 삭제 리스트에 추가
		for(int i=0; i<n; i++) { //num번 노드와 연결된 자식들을 탐색
			if(tree[num].child[i]==1) { //num번 노드의 자식을 찾으면
				makeDelList(i); //자식과 연결된 또 다른 노드들을 재귀탐색
			}
		}
	}

}
class Node{
	//순서대로 노트번호, 부모번호, 자식리스트, 자식의 수
	int num, parent, child[] = new int[50], childCnt;
	
	//자식이 추가되면
	public void setChild(int childNum) {
		child[childNum] = 1; //자식리스트에서 해당 자식번호를 1로 설정
		childCnt++; //자식의 수 +1
	}
	
}