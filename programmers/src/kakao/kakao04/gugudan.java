package kakao.kakao04;

public class gugudan {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			System.out.println(i+" * 1 = "+(i*1));
			for(int j=2; j<=9; j++) {
				System.out.print(i);
				for(int k=2; k<=j; k++) {
					System.out.print( " * "+i);
				}
				System.out.print(" = "+(int)Math.pow(i, j));
				System.out.println("");
			}
		}
	}

}
