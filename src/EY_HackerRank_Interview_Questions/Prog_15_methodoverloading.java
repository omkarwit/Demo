package EY_HackerRank_Interview_Questions;

public class Prog_15_methodoverloading {

	public int method(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
//	public double method(int a,int b) {
//		System.out.println(a*b);
//		return a*b;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog_15_methodoverloading obj=new Prog_15_methodoverloading();
		obj.method(1,2);

	}

}
