package programmers.test2;

public class Test0422 {

	private int[][] office = new int[][] {{5,-1,4},{6,3,-1},{2,-1,1}};
	private int r= 1;
	private int c =0;
	private String[] move = new String[] {"go","go","right","go","right","go","left","go"};
	private int answer =0;
	private int arrow = 0;
	
	public int robot() {
		
		for(int i=0; i<move.length; i++) {
			if(move[i].equals("right")) {
				arrow+=1;
				if(arrow==3) {
					arrow=0;
				}
			}
			else if(move[i].equals("left")) {
				arrow-=1;
				if(arrow==-1) {
					arrow=3;
				}
			}
			solution(r,c,arrow);
		}
		System.out.println(answer);
		
		return answer;
	}
	
	public void solution(int r, int c, int d) {
		answer += office[r][c];
		office[r][c]=0;
		
		choice(r,c,d);
	}
	
	public void choice(int r, int c, int d) {
		int[] leftLocation = left(r,c,d);
		int leftX = leftLocation[0];
		int leftY = leftLocation[1];
		
		
		
	}
	
	public int[] left(int r, int c, int d) {
		switch(d) {
			case 0 : c--; break;
			case 1 : r--; break;
			case 2 : c++; break;
			case 3 : r++; break;
		}
		return new int[] {r,c};
	}
}

