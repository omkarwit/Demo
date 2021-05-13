package EY_HackerRank_Interview_Questions;

interface X{
	public void print();
}

interface Y{
	public void print();
}

public class Prog_14_interface implements X,Y{

	public void print() {
		System.out.println("Hello World!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog_14_interface obj=new Prog_14_interface();
		obj.print();

	}

}
