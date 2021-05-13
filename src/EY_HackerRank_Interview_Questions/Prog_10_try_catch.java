package EY_HackerRank_Interview_Questions;

public class Prog_10_try_catch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Started ");
	
		try {
			Integer I=new Integer("abc");
			System.out.println("Program Completed");
		}
		catch(Exception e){
			System.out.println("Execption caught");
		}
	
	}	
}
