import java.util.Scanner;

public class Basic_Programming_PrimeNumber {

	//WAP : A prime number is a number which is divisible by only two numbers: 1 and itself.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP : Prime number
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	    scan.close();
		
	    for(int i=2;i<=num/2;i++)
		{
	       if(num%i==0)
		   {
		      isPrime=false;
		      break;
		   }
		}

	    //If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	
}
