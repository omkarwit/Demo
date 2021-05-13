package EY_HackerRank_Interview_Questions;

public class Prog_3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x=new int[3];
		x[1]=50;
			Object obj=x;
		
		int []y=(int [])obj;
		y[1]=100;
		
			System.out.println(x[1]);
			((int [])obj) [1]=500;
			System.out.println(x[1]);
	}

}
