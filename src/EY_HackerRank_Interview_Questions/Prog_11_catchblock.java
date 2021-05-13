package EY_HackerRank_Interview_Questions;

public class Prog_11_catchblock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int [] arr=new int[5];
			arr[5]=100;
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		// No catch repetative either general catch or specific
//		}catch(ArrayIndexOutOfBoundsException exp) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		}
		}
	}	
}
