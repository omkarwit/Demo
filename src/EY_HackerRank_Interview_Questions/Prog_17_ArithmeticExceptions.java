package EY_HackerRank_Interview_Questions;

public class Prog_17_ArithmeticExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(2.0/0);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
		}
		
	}

}
