//https://www.hackerrank.com/challenges/bon-appetit?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BonAppetit
{

	public static int bonAppetit(int n, int k, int b, int[] ar) 
	{
        int iBalance = 0;
        double dActualCost = 0;
        for(int i=0; i< n; i++)
        {
        	if(i == k)
        	{
        		continue;
        	}
        	else
        	{
        		dActualCost = dActualCost + ar[i];
        	}        	
        }        
        
        dActualCost = dActualCost/2;
        iBalance = b - (int)dActualCost;
        
        return iBalance;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
        {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result != 0)
        {
        	System.out.println(result);
        }
        else
        {
        	System.out.println("Bon Appetit");
        }
    }

}
