public class String_Rotation {

/*	
 * // Reversing string 
 * 
 * public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anyString="Bhalerao";
		//StringBuffer sb_string=new StringBuffer(anyString);
		//System.out.println(sb_string.reverse());
		
		for(int i=anyString.length()-1;i>=0;i--) {
			System.out.print(anyString.charAt(i));
		}
		
	}*/

	
	public static void main(String[] args) {

	//WAP to rotation of String.	
		
	String anyString="Bhalerao";
	int counter=0;
	int anyString_lenght=anyString.length();
	
	StringBuffer anyStringBuffer=new StringBuffer(anyString);
	anyStringBuffer.append(anyString);
	
	for(int i=0;i<anyString_lenght;i++) {
		for(int j=0;j<anyString_lenght;j++) {
			System.out.print(anyStringBuffer.charAt(i+j));
		}
		System.out.println();
		counter++;
	}
	
	System.out.println(counter-1);
	} 
}
