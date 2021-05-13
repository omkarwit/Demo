package EY_HackerRank_Interview_Questions;

public class Prog_9_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="EY";
		String s2=new String("EY");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("EY");
		String s4=new String("EY");
		System.out.println(s3==s4);
		
		String s5="EY";
		System.out.println(s1==s5);
		
	}

}
