import java.util.Arrays;
public class Array_positiveNegativeNumbersRearrangment {
	
	
/*	static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
	// A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given random numbers (both positive and negative) in an array 
		Example - int arr =[-2,-4,9,8,19,-23,-1,-33] 
		Code to keep all negative number on the left and positive numbers on the right using one iteration*/
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        
// Method 2 => Using method        
        
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
       
// Method 1 => Using built - in method of Arrays sort()
        
        /*
         * 
         * Arrays.sort(arr);
         * 
         * */
        for (int i = 0; i < n; i++)   
        {       
        System.out.print(arr[i]);   
        }   
		
	}

}
