
public class Reverse_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method - 1 : Using Algorithm

		int num1=12395;
		int rev=0;
		String str_rev="";
		
		while(num1 !=0) {
			//rev=rev*10+num1%10;    // '%' => Gives u last digit. [e.g- 5] ; if rev is int type -ONLY.
			str_rev=str_rev+num1%10; // str_rev appending if str_rev is String type - ONLY.
			num1=num1/10;            // '/' => Gives u except last digit number [e.g- 1231]  
		}
		System.out.println(str_rev);

// Method -2 : Using StringBuffer //Converted int into String and String into StringBuffer
		
		/*long num2=12345678;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		*/
	}
}












