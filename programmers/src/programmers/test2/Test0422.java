package programmers.test2;

public class Test0422 {

	
	
	public int robot(int [][] office, int r, int c, String[] move) {
		int result=office[r][c];
		office[r][c]=0;
		String flag[]= {"북","동","남","서"};
		int flag2=0;
		int r1=r;
		int c1=c;
		for(int i=0;i<move.length;i++){
			if(move[i].equals("right"))
				flag2=flag2+1;
			else if(move[i].equals("left"))
				flag2=flag2-1;
			
			if(flag2==4)
				flag2=0;
			if(flag2==-1)
				flag2=3;
			
			if(move[i].equals("go")){
				switch(flag[flag2]) {
				case "북":
					r1=r1-1;
					break;
				case "동":
					c1=c1+1;
					break;
				case "남":
					r1=r1+1;
					break;
				case "서":
					c1=c1-1;
					break;
				}
			}
			
			if(r1!=-1&&c1!=-1&&office[r1][c1]!=-1){
				r=r1;
				c=c1;
			}
			else {
				r1=r;
				c1=c;
			}
			
			if(office[r][c]>0){
				result+=office[r][c];
				office[r][c]=0;
			}
		}
		return result;
	}
}

