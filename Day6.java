import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	String input = "";
    	String even = "";
    	String odd = "";
    	int l = 0;
    	
    	for(int j=0; j < n; j++)
    	{
    		input = scan.next();
    		l = input.length();
    		even = "";
    		odd = "";
    		
    		for(int i=0; i< l; i++)
        	{
        		if(i%2 == 0)
        		{
        			even = even + input.charAt(i);
        		}
        		else
        		{
        			odd = odd + input.charAt(i);
        		}
        	}
    		System.out.println(even + " " + odd);
    	}
    		
    }
}