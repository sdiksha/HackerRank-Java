import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/mini-max-sum
public class MiniMaxSum {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long lMax = 0;
        long lMin = 0;
        long lTemp = 0;
        for(int i=0; i< 5; i++)
        {
        	a[i]= in.nextLong();
        }
        
        for(int i=0; i< 4; i++)
        {
        	for(int j=i+1; j<5; j++)
        	{
        		if(a[i] > a[j])
        		{
        			lTemp = a[i];
        			a[i] = a[j];
        			a[j] = lTemp;
        		}
        	}
        }
        
        for(int i=0; i< 5; i++)
        {
        	if (i > 0)
        	{
        		lMax = lMax + a[i];
        	}
        	
        	if(i < 4)
        	{
        		lMin = lMin + a[i];
        	}
        }
        
        System.out.println(lMin + " " + lMax);
    }
}