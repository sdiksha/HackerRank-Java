import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9 {

    public static void main(String[] args) {

    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	System.out.println(factorial(n));
    
    }
    
    public static long factorial(int n)
    {
    	long fact = 1;
    	
    	if(n > 1)
    	{
    		for(int i=2; i<=n; i++)
    		{
    			fact = fact * i;
    		}
    	}
   
    	return fact;
    }
}