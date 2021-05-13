package EY_HackerRank_Interview_Questions;

class StaticClass{
	static int staticVarible;
	
	static {
		System.out.println("StaticBlock");
		staticVarible=30;
	}
	static void staticMethod() {
		System.out.println("StaticMethod");
		System.out.println(staticVarible);
	}
}

public class Prog_1_staticClass {

	static {
		System.out.println("Program1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.staticVarible =50;
		StaticClass.staticMethod();
	}
}
