package java_study;

public class CaptionTvTest {
		
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel= 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("HELLO, WORLD1");
		ctv.caption = true;
		ctv.displayCaption("HELLO, WORLD2");
	}
	
}

class Tv{
	String color;
	boolean power;
	int channel ;

	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String test) {
		if(caption) {
			System.out.println(test);
		}
	}
}
