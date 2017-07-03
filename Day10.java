import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String s = "";
        int mod = 0;
        int r = 0;
        int count = 0;
        boolean bHasOne = false;
        
        while (n > 1)
        {
        	mod = n%2;
        	r = n/2;
        	s = mod + s;
        	n = r;
        }
        s = n + s;
        int max=0;
        
        for(int i=0; i< s.length()-1; i++)
        {
        	count = 0;
        	//System.out.println("Count: " + count);
        	if(s.charAt(i) == '1')
        	{
        		count = count+1;
        		//System.out.println("Count: " + count);
        		for(int j=i+1; j< s.length(); j++)
            	{
            		if (s.charAt(j) == '1')
                	{
            			count = count+1;
            			if(max < count)
            			{
            				max = count;
            			}
            			//System.out.println("Count: " + count);
                	}	
            		else if (s.charAt(j) == '0')
            		{
            			if(max < count)
            			{
            				max = count;
            			}
            			break;
            		}
            	}
        	}
        }
        
        //System.out.println("final s: " + s);
        System.out.println(max);
        
    }
}
