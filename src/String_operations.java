
public class String_operations {


	public static void main(String args[]) {
		
		// *************** Char to String 
		char[] samplechar= {'E','A','S','Y'};
		char revserString;
		char[] revString;
		
		//System.out.println(samplechar.toString());
		String chartoString =new String(samplechar);
		int stringlength=chartoString.length();
		System.out.println(chartoString);
		System.out.println(stringlength);
		
		for(int i=stringlength; i>0;i--) {
			revserString=chartoString.charAt(i-1);
			//System.out.println(samplechar[i]);
			}

		
		// ************ int into String
		int nums=12346;
		String numToString=new String().valueOf(nums);
		System.out.println("Number to String :"+numToString);	
	}
}
