package programmers.test02;

public class Run {

	public static void main(String[] args) {

		Solution te = new Solution();
		
		int[][] office = new int[][] {{5,-1,4},{6,3,-1},{2,-1,1}};
		String[] move = new String[] {"go","go","right","go","right","go","left","go"};
		
		System.out.println(te.robot(office, 1, 0, move));
		
		
	}

}
