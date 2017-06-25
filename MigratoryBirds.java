//https://www.hackerrank.com/challenges/migratory-birds?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
	}
	
	public static int migratoryBirds(int n, int[] ar) 
	{
        HashMap<Integer, Integer> birds = new HashMap<Integer, Integer>();
        int iMaxValue = 0;
        for(int i=0; i< n; i++)
        {
        	if(birds.containsKey(ar[i]))
        	{
        		int temp = birds.get(ar[i]).intValue() + 1;
        		birds.put(ar[i], temp);
        		if(iMaxValue < temp)
        		{
        			iMaxValue = temp;
        		}
        	} 
        	else
        	{
        		birds.put(ar[i], 1);
        	}
        } 
        
        int iKey = 0;
        for(Integer i: birds.keySet())
        {
        	if(birds.get(i).intValue() >= iMaxValue)
        	{
        		iKey = i;
        		break;
        	}
        }
        
        return iKey;
    }
}