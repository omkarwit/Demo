package EY_HackerRank_Interview_Questions;

class A {
	int nonStaticVaribale;
	static int staticVaribale;
	
	static void staticMethod() {
		System.out.println(staticVaribale);
	}
	
	void nonStaticMethod() {
		System.out.println(staticVaribale);
		System.out.println(nonStaticVaribale);
	}
}

public class Prog_2_staticVariable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.staticVaribale=10;
		A.staticMethod();
		
		A a1=new A();
		
		System.out.println(a1.nonStaticVaribale);
		System.out.println(a1.staticVaribale);
	}
}
