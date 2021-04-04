package java_study;

public class Study {
	
	String color;
	boolean power;
	int channel ;

	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
		
	public static void main(String args[]) {
		Study t1 = new Study();
		Study t2 = new Study();
		
		
		System.out.println("t1의 channel값은 "+ t1.channel +"입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel +"입니다.");
		
		t2 = t1;
		
		System.out.println("t1 은 "+t1.channel);
		System.out.println("t2 은 "+t2.channel);
		
		t1.channel = 7;
		
		System.out.println("변경");
		
		System.out.println("t1의 channel값은 "+ t1.channel +"입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel +"입니다.");
		
	}
	
}

