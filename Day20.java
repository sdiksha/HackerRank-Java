import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day20 {

	/*for (int i = 0; i < n; i++) {
	    // Track number of elements swapped during a single array traversal
	    int numberOfSwaps = 0;
	    
	    for (int j = 0; j < n - 1; j++) {
	        // Swap adjacent elements if they are in decreasing order
	        if (a[j] > a[j + 1]) {
	            swap(a[j], a[j + 1]);
	            numberOfSwaps++;
	        }
	    }
	    
	    // If no elements were swapped during a traversal, array is sorted
	    if (numberOfSwaps == 0) {
	        break;
	    }
	} */
	
	public static void main(String[] args) {
		try
		{
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] a = new long[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextLong();
	        }
	        int iTotalSwaps = 0;
	        // Write Your Code Here
	        for(int i=0; i< n-1; i++)
	        {
	        	int iSteps = 0;
	        	
	        	for(int j=1; j< n; j++)
	        	{
	        		if(a[j] < a[i])
	        		{
	        			long temp = a[j];
	        			a[j] = a[i];
	        			a[i] = temp;   
	        			iSteps = iSteps +1;
	        		}
	        	}
	        	iTotalSwaps = iTotalSwaps + iSteps;
	        	if(iSteps == 0)
	        	{
	        		break;
	        	}
	        }
	        
	        System.out.println("Array is sorted in " + iTotalSwaps + " swaps.");
	        System.out.println("First Element: " + a[0]);
	        System.out.println("Last Element: " + a[n-1]);
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.out.println("Invalid number of elements.");
		}
    }
	
}
