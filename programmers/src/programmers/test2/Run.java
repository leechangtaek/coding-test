package programmers.test2;

public class Run {

	public static void main(String[] args) {

		Test0422 te = new Test0422();
		
		int[][] office = new int[][] {{5,-1,4},{6,3,-1},{2,-1,1}};
		String[] move = new String[] {"go","go","right","go","right","go","left","go"};
		
		System.out.println(te.robot(office, 1, 0, move));
		
		
	}

}
