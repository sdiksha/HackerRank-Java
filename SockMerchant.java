//https://www.hackerrank.com/challenges/sock-merchant?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant
{
	public static int sockMerchant(int n, int[] ar) 
	{
        int iPairs = 0;
        HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
        for(int i=0; i< n; i++)
        {
        	if(socks.containsKey(ar[i]))
        	{
        		socks.remove(ar[i]);
        		iPairs++;
        	}
        	else
        	{
        		socks.put(ar[i], 1);
        	}
        }
        
        return iPairs;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
        {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
