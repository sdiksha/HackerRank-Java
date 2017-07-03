
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/challenges/compare-the-triplets
public class CompareTheTriplets 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        for (int i=0; i< 3; i++)
        {
        	a[i] = in.nextInt();
        }
        
        for (int i=0; i< 3; i++)
        {
        	b[i] = in.nextInt();
        }
        
        int iAlice = 0;
        int iBob = 0;
        
        for (int i=0; i< 3; i++)
        {
        	int iTemp = compare(a[i], b[i]);
        	if(iTemp == 1)
            {
            	iAlice = iAlice +1;;
            }
            else if (iTemp == -1)
            {
            	iBob = iBob +1;
            }
        	
        }
        
        System.out.println(iAlice + " " + iBob);
    }
    
    public static int compare(int i, int j)
    {
    	if (i > j)
    	{
    		return 1;
    	}
    	else if (i< j)
    	{
    		return -1;
    	}
    	else
    	{
    		return 0;
    	}
    }
}