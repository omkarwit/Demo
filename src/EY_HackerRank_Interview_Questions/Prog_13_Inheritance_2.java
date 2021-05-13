package EY_HackerRank_Interview_Questions;

abstract class Animal{
	abstract void voice();
	abstract void color();
}

class Lion extends Animal{
	void voice() {
		System.out.println("Roar");
	}
	void color() {
		System.out.println("AztecGOld");
	}
}

public class Prog_13_Inheritance_2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Lion();
		obj.voice();
		obj.color();
	}

}
